package com.ozair.funnypranksounds.Activities;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.Glide;
import com.ozair.funnypranksounds.DataBases.FvrtDB;
import com.ozair.funnypranksounds.Models.LangModel;
import com.ozair.funnypranksounds.R;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class PlaySoundActivity extends AppCompatActivity {
    private static final int REQUEST_PERMISSION_WRITE = 1001;
    private static final String TAG = "PlaySoundActivity";

    ImageView playImage, Downloadbtn, favimg;
    TextView tapToPlay, taptopause, toolbartext;
    private MediaPlayer mediaPlayer;
    RelativeLayout playLay;
    LottieAnimationView lottieAnimationView;
    private boolean isPlaying = false;
    private int soundFile;
    private int imageFile;
    private String nameFile;
    private int position;
    private String keyId;
    private String favStatus;
    private boolean isFavourite = false;
    List<LangModel> soundList = new ArrayList<>();

    private static FvrtDB fvrtDB;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_sound);
        fvrtDB = new FvrtDB(this);

        lottieAnimationView = findViewById(R.id.lotiee);
        playLay = findViewById(R.id.pal_lay);
        toolbartext = findViewById(R.id.tooltext);
        favimg = findViewById(R.id.fvrtimg);
        Downloadbtn = findViewById(R.id.downloadimg);
        taptopause = findViewById(R.id.taptopause);
        playImage = findViewById(R.id.playimg);
        tapToPlay = findViewById(R.id.taptoplay);

        imageFile = getIntent().getIntExtra("imageFile", -1);
        soundFile = getIntent().getIntExtra("soundFile", -1);
        nameFile = getIntent().getStringExtra("soundname");
        position = getIntent().getIntExtra("position", 0);
        keyId = getIntent().getStringExtra("keyId");

        toolbartext.setText(nameFile);

        if (imageFile != -1) {
            // Set the image in the ImageView using Glide
            Glide.with(this)
                    .load(imageFile)
                    .into(playImage);
        }

        if (soundFile != -1) {
            playImage.setOnClickListener(v -> {
                toggleTapToPlayVisibility();
                if (tapToPlay.getVisibility() == View.VISIBLE) {
                    stopPlaying();
                    lottieAnimationView.setVisibility(View.GONE);
                } else {
                    startPlaying(soundFile);
                    lottieAnimationView.setVisibility(View.VISIBLE);
                }
            });
        }

        Downloadbtn.setOnClickListener(v -> {
            if (checkPermission()) {
                startDownload(soundFile);
            } else {
                requestPermission();
            }
        });

        favimg.setOnClickListener(v -> {
            toggleFavourite();
        });

        // Populating soundList with data
        updateSoundListFromIntent();

        // Logging the contents of soundList for debugging
        for (int i = 0; i < soundList.size(); i++) {
            LangModel langModel = soundList.get(i);
            Log.d(TAG, "LangModel at index " + i + ": " + langModel.getSoundname() + ", " + langModel.getFavStatus());
        }

        // Fetch the favorite status for all items in the soundList
        fetchFavStatusForAllItems();

        // Update fav image status based on initial data
        updateFavImage();
    }

    private boolean checkPermission() {
        return ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED;
    }

    private void requestPermission() {
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQUEST_PERMISSION_WRITE);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_PERMISSION_WRITE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(this, "Permission granted.", Toast.LENGTH_SHORT).show();
                startDownload(soundFile);  // Retry download if permission is granted
            } else {
                Toast.makeText(this, "Permission denied.", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void startPlaying(int soundFile) {
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(this, soundFile);
        mediaPlayer.start();
        isPlaying = true;
    }

    private void stopPlaying() {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
        isPlaying = false;
    }

    private void toggleTapToPlayVisibility() {
        if (tapToPlay.getVisibility() == View.VISIBLE) {
            tapToPlay.setVisibility(View.GONE);
            taptopause.setVisibility(View.VISIBLE);
            startPlaying(soundFile);
        } else {
            tapToPlay.setVisibility(View.VISIBLE);
            taptopause.setVisibility(View.GONE);
            stopPlaying();
        }
    }

    private void startDownload(int soundFile) {
        new DownloadFileTask().execute(soundFile);
    }

    private class DownloadFileTask extends AsyncTask<Integer, Void, Boolean> {

        @Override
        protected Boolean doInBackground(Integer... params) {
            int resourceId = params[0];
            InputStream input = null;
            FileOutputStream output = null;
            try {
                // Input stream from resource
                input = getResources().openRawResource(resourceId);
                File outputFile = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "sound.mp3");
                output = new FileOutputStream(outputFile);

                byte[] buffer = new byte[8192];
                int bytesRead;
                while ((bytesRead = input.read(buffer)) != -1) {
                    output.write(buffer, 0, bytesRead);
                }

                output.flush();
                return true;
            } catch (Exception e) {
                Log.e(TAG, "Error downloading file: " + e.getMessage());
                return false;
            } finally {
                try {
                    if (input != null) input.close();
                    if (output != null) output.close();
                } catch (Exception e) {
                    Log.e(TAG, "Error closing streams: " + e.getMessage());
                }
            }
        }

        @Override
        protected void onPostExecute(Boolean result) {
            super.onPostExecute(result);
            if (result) {
                Toast.makeText(PlaySoundActivity.this, "Download complete!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(PlaySoundActivity.this, "Download failed!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void updateSoundListFromIntent() {
        // Retrieve data from intent extras and add LangModel objects to the list
        LangModel model = new LangModel();
        model.setImgsrc(imageFile);
        model.setSoundsrc(soundFile);
        model.setSoundname(nameFile);
        model.setKey_Id(String.valueOf(keyId));
        model.setFavStatus(favStatus);
        soundList.add(model);
    }

    private void fetchFavStatusForAllItems() {
        for (LangModel model : soundList) {
            Cursor cursor = fvrtDB.readDataBase(model.getKey_Id());
            if (cursor != null && cursor.moveToFirst()) {
                int favStatusIndex = cursor.getColumnIndex(FvrtDB.Favourite_Status);
                if (favStatusIndex >= 0) {
                    model.setFavStatus(cursor.getString(favStatusIndex));
                } else {
                    Log.e(TAG, "Favourite_Status column not found in the database for keyId: " + model.getKey_Id());
                    model.setFavStatus("0"); // Default value if column not found
                }
                cursor.close();
            } else {
                Log.e(TAG, "Cursor is null or empty for keyId: " + model.getKey_Id());
                model.setFavStatus("0"); // Default value if cursor is null or empty
            }
        }
    }

    private void toggleFavourite() {
        if (position >= 0 && position < soundList.size()) {
            LangModel langModel = soundList.get(position);
            if (langModel != null && langModel.getFavStatus() != null) {
                if (langModel.getFavStatus().equals("0")) {
                    langModel.setFavStatus("1");
                    fvrtDB.insertintoDataBase(nameFile, soundFile, imageFile, keyId, "1");
                    favimg.setImageResource(R.drawable.fvrtimg2);
                } else {
                    langModel.setFavStatus("0");
                    fvrtDB.removeFav(keyId);
                    favimg.setImageResource(R.drawable.fvrtimg);
                }
                // Update favStatus variable with the current favorite status of the selected item
                favStatus = langModel.getFavStatus();
            } else {
                Log.e(TAG, "langModel or favStatus is null for position: " + position);
            }
        } else {
            Log.e(TAG, "soundList is empty or invalid position");
        }
    }

    private void updateFavImage() {
        if (favStatus != null && favStatus.equals("1")) {
            favimg.setImageResource(R.drawable.fvrtimg2);
        } else {
            favimg.setImageResource(R.drawable.fvrtimg);
        }
    }
}
