package com.ozair.funnypranksounds.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.ozair.funnypranksounds.R;
import com.ozair.funnypranksounds.Utilz.SharedPrefs;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }
    protected void onResume() {
        super.onResume();
        new Handler().postDelayed(() -> {
            Intent intent;
            if (SharedPrefs.isFirstTimeLanguageSelected(this)) {
                intent = new Intent(this, MainActivity.class);
            } else {
                intent = new Intent(this, LanguageActivity.class);
            }
startActivity(intent);

            finish();
        }, 2000);


}}