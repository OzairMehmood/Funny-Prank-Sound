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
import com.ozair.funnypranksounds.R;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public class PlaySoundActivity extends AppCompatActivity {
    private static final int REQUEST_PERMISSION_WRITE = 1001;
    private static final String TAG = "PlaySoundActivity";

    ImageView playImage, Downloadbtn, fvrtbtn;
    TextView tapToPlay, taptopause, toolbartext;
    private MediaPlayer mediaPlayer;
    RelativeLayout playLay;
    LottieAnimationView lottieAnimationView;
    private boolean isPlaying = false;
    private int soundFile;
    private boolean isFavourite = false;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_sound);
        lottieAnimationView = findViewById(R.id.lotiee);
        playLay = findViewById(R.id.pal_lay);
        toolbartext = findViewById(R.id.tooltext);
        fvrtbtn = findViewById(R.id.fvrtimg);
        Downloadbtn = findViewById(R.id.downloadimg);
        taptopause = findViewById(R.id.taptopause);
        playImage = findViewById(R.id.playimg);
        tapToPlay = findViewById(R.id.taptoplay);

        int imageFile = getIntent().getIntExtra("imageFile", -1);
        soundFile = getIntent().getIntExtra("soundFile", -1);
        String nameFile = getIntent().getStringExtra("soundname");
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
        fvrtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                togglefvrt();
            }
        });
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
        } else {
            tapToPlay.setVisibility(View.VISIBLE);
            taptopause.setVisibility(View.GONE);
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

    private void togglefvrt() {
        if (isFavourite) {
            isFavourite = false;

            fvrtbtn.setImageResource(R.drawable.fvrtimg);
            Toast.makeText(PlaySoundActivity.this, "Removed From Favourite", Toast.LENGTH_SHORT).show();
        } else {
            isFavourite = true;

            fvrtbtn.setImageResource(R.drawable.fvrtimg2);
            Toast.makeText(PlaySoundActivity.this, "Added TO Favourite", Toast.LENGTH_SHORT).show();
        }
    }
}
