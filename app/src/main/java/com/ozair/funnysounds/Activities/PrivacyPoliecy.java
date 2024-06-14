package com.ozair.funnysounds.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.ArhamZeeApps.funnysounds.R;


public class PrivacyPoliecy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_poliecy);
        WebView webView = findViewById(R.id.privacyweb);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("file:///android_asset/privacypoliecy.html");

    }
}