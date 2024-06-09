package com.ozair.funnypranksounds.Activities;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
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

        int imageFile = getIntent().getIntExtra("imageFile", -1);
        soundFile = getIntent().getIntExtra("soundFile", -1);
        String nameFile = getIntent().getStringExtra("soundname");
        int position = getIntent().getIntExtra("position", 0);
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

        favimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check if soundList contains at least one element
                if (position >= 0 && position < soundList.size()) {
                    LangModel langModel = soundList.get(position); // Access the element at the correct position
                    if (langModel != null && langModel.getFavStatus() != null) {
                        if (langModel.getFavStatus().equals("0")) {
                            langModel.setFavStatus("1");
                            fvrtDB.insertintoDataBase(langModel.getSoundname(), langModel.getImgsrc(), langModel.getSoundsrc(), langModel.getKey_Id(), langModel.getFavStatus());
                            favimg.setImageResource(R.drawable.fvrtimg2);
                        } else {
                            langModel.setFavStatus("0");
                            fvrtDB.removeFav(langModel.getKey_Id());
                            favimg.setImageResource(R.drawable.fvrtimg);
                        }
                    } else {
                        Log.e(TAG, "langModel or favStatus is null");
                    }
                } else {
                    Log.e(TAG, "soundList is empty or invalid position");
                }
            }
        });

        // Populating soundList with data
        soundList = getSoundListFromIntent(); // Implement this method to get the list from intent extras

        // Logging the contents of soundList for debugging
        for (int i = 0; i < soundList.size(); i++) {
            LangModel langModel = soundList.get(i);
            Log.d(TAG, "LangModel at index " + i + ": " + langModel.getSoundname() + ", " + langModel.getFavStatus());
        }
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

    private List<LangModel> getSoundListFromIntent() {
        List<LangModel> list = new ArrayList<>();
        // Retrieve data from intent extras and add LangModel objects to the list
        // Example:
        int imageFile = getIntent().getIntExtra("imageFile", -1);
        int soundFile = getIntent().getIntExtra("soundFile", -1);
        String soundName = getIntent().getStringExtra("soundname");
        int keyId = getIntent().getIntExtra("keyId", -1);
        String favStatus = getIntent().getStringExtra("favStatus");

        LangModel model = new LangModel();
        model.setImgsrc(imageFile);
        model.setSoundsrc(soundFile);
        model.setSoundname(soundName);
        model.setKey_Id(String.valueOf(keyId));
        model.setFavStatus(favStatus);
        list.add(model);

        return list;
    }
}
