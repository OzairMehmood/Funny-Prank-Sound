package com.ozair.funnypranksounds.Activities;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.Glide;
import com.ozair.funnypranksounds.R;

public class PlaySoundActivity extends AppCompatActivity {
    ImageView playImage;
    TextView tapToPlay, taptopause, toolbartext;
    private MediaPlayer mediaPlayer;
    RelativeLayout playLay;
    LottieAnimationView lottieAnimationView;
    private boolean isPlaying = false;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_sound);
        lottieAnimationView = findViewById(R.id.lotiee);
        playLay = findViewById(R.id.pal_lay);
        toolbartext = findViewById(R.id.tooltext);
        taptopause = findViewById(R.id.taptopause);
        playImage = findViewById(R.id.playimg);
        tapToPlay = findViewById(R.id.taptoplay);

        int imageFile = getIntent().getIntExtra("imageFile", -1);
        int soundFile = getIntent().getIntExtra("soundFile", -1);
        int nameFile = getIntent().getIntExtra("soundname",0);
        toolbartext.setText(nameFile);

        if (imageFile != -1) {
            // Set the image in the ImageView using Glide
            Glide.with(this)
                    .load(imageFile)
                    .into(playImage);
        }

        if (soundFile != -1) {
            playImage.setOnClickListener(v -> {
                if (isPlaying) {
                    stopPlaying();
                    lottieAnimationView.setVisibility(View.GONE);
                } else {
                    startPlaying(soundFile);
                    lottieAnimationView.setVisibility(View.VISIBLE);
                }
                toggleTapToPlayVisibility();
            });
        }
    }

    private void startPlaying(int soundFile) {
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(this, soundFile);
        mediaPlayer.start();
        isPlaying = true;
        // Set the duration for the Lottie animation
        setLottieAnimationDuration(soundFile);
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
        if (tapToPlay.getVisibility() == TextView.VISIBLE) {
            tapToPlay.setVisibility(TextView.GONE);
            taptopause.setVisibility(TextView.VISIBLE);
        } else {
            tapToPlay.setVisibility(TextView.VISIBLE);
            taptopause.setVisibility(TextView.GONE);
        }
    }

    // Set the duration for the Lottie animation based on the sound file
    private void setLottieAnimationDuration(int soundFile) {
        // Calculate the duration based on the sound file or any other criteria
        int duration = calculateDuration(soundFile);
        // Calculate the speed to fit the animation in the duration
        float speed = (float) lottieAnimationView.getDuration() / duration;
        // Set the speed of the animation
        lottieAnimationView.setSpeed(speed);
    }

    // Method to calculate the duration (you need to implement this)
    private int calculateDuration(int soundFile) {
        // Implement your logic to calculate the duration based on the sound file
        return 15000; // Placeholder duration in milliseconds
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
