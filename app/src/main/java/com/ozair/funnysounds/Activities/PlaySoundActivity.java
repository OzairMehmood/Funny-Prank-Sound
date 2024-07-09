package com.ozair.funnysounds.Activities;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import com.ArhamZeeApps.funnysounds.R;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.Glide;
import com.ozair.funnysounds.DataBases.FvrtDB;
import com.ozair.funnysounds.Fragments.FavouriteFragment;
import com.ozair.funnysounds.Models.LangModel;
import com.ozair.funnysounds.appconstants;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class PlaySoundActivity extends AppCompatActivity {
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
    private ActivityResultLauncher<String> createDocumentLauncher;
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
        favStatus = getIntent().getStringExtra("favStatus");
        toolbartext.setText(nameFile);
        if (imageFile != -1) {
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
            createDocumentLauncher.launch("sound_" + soundFile + ".mp3");
        });
        favimg.setOnClickListener(v -> {
            toggleFavourite();
        });

        updateSoundListFromIntent();
       // fetchFavStatusForAllItems();
        updateFavImage();

        createDocumentLauncher = registerForActivityResult(
                new ActivityResultContracts.CreateDocument(),
                uri -> {
                    if (uri != null) {
                        saveFileToUri(uri, soundFile);
                    } else {
                        Toast.makeText(PlaySoundActivity.this, "Failed to create file", Toast.LENGTH_SHORT).show();
                    }
                }
        );
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

    private void saveFileToUri(Uri uri, int soundFile) {
        try (InputStream inputStream = getResources().openRawResource(soundFile);
             OutputStream outputStream = getContentResolver().openOutputStream(uri)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
            Toast.makeText(this, "Download complete!", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            Log.e(TAG, "Error saving file: " + e.getMessage());
            Toast.makeText(this, "Download failed!", Toast.LENGTH_SHORT).show();
        }
    }

    private void updateSoundListFromIntent() {
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
        if (soundList.size() > 0) {
            LangModel langModel = soundList.get(0);
            if (langModel != null && langModel.getFavStatus() != null) {
                if (langModel.getFavStatus().equals("0")) {
                    langModel.setFavStatus("1");
                    fvrtDB.insertintoDataBase(nameFile, soundFile, imageFile, keyId, "1");
                    favimg.setImageResource(R.drawable.fvrtimg2);
                    appconstants.isAddedtoFvrt=true;
                   /// FavouriteFragment.mfavMuteable.setValue(true);

                } else {
                    langModel.setFavStatus("0");
                    fvrtDB.removeFav(keyId);
                    favimg.setImageResource(R.drawable.fvrtimg);
                    appconstants.isAddedtoFvrt=false;
                   // FavouriteFragment.mfavMuteable.setValue(true);
                }
                favStatus = langModel.getFavStatus();
            } else {
                Log.e(TAG, "langModel or favStatus is null for position: " + position);
            }
        } else {
            Log.e(TAG, "soundList is empty or invalid position");
        }
    }

    private void updateFavImage() {
        String itemId = keyId;
        String itemTitle = nameFile;

        boolean isFavourite = fvrtDB.isItemFavourite(itemTitle);

        if (isFavourite) {
            favimg.setImageResource(R.drawable.fvrtimg2);
            appconstants.isAddedtoFvrt=true;

            Log.d("PlaySoundActivity", "Item with ID " + itemId + " is a favorite.");
        } else {
            favimg.setImageResource(R.drawable.fvrtimg);
            appconstants.isAddedtoFvrt=false;
            Log.d("PlaySoundActivity", "Item with ID " + itemId + " is not a favorite.");
        }


       /* if (favStatus != null && favStatus.equals("1")) {
            favimg.setImageResource(R.drawable.fvrtimg2);
            appconstants.isAddedtoFvrt=true;
        } else {
            favimg.setImageResource(R.drawable.fvrtimg);
            appconstants.isAddedtoFvrt=false;
        }*/
    }

    @Override
    protected void onResume() {
        super.onResume();
        stopPlaying();
    }

    @Override
    public void onBackPressed() {
        stopPlaying();
        super.onBackPressed();
    }
}
