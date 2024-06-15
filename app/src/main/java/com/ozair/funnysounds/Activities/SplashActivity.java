package com.ozair.funnysounds.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


import com.ArhamZeeApps.funnysounds.R;
import com.ozair.funnysounds.Utilz.AdsUtilize;
import com.ozair.funnysounds.Utilz.SharedPrefs;
import com.ozair.funnysounds.appconstants;

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
                appconstants.isSplashRecentlyShown=true;
                AdsUtilize.getInstance().startLoadAdActivity(SplashActivity.this, MainActivity.class.getCanonicalName(), getResources().getString(R.string.intersitialSplash), null, 0);

               // intent = new Intent(this, MainActivity.class);
            } else {
                appconstants.isSplashRecentlyShown=true;
                AdsUtilize.getInstance().startLoadAdActivity(SplashActivity.this, LanguageActivity.class.getCanonicalName(), getResources().getString(R.string.intersitialSplash), null, 0);

                //  intent = new Intent(this, LanguageActivity.class);
            }
           // startActivity(intent);

            finish();
        }, 2000);
    }
}