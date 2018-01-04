package com.abdulrehman.android.itempire;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class ContactActivity extends AppCompatActivity {
    WebView webView;

    WebSettings webSettings;

    android.support.v7.widget.Toolbar toolbar;

    String Url = "http://itempire.net/index.php?display=contact";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);


        toolbar = findViewById(R.id.toolbar);
        webView = findViewById(R.id.webview6);


        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Contact Us");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        WebSettings webViewSettings = webView.getSettings();
        webViewSettings.setJavaScriptEnabled(true);
        webView.loadUrl(Url);
    }
}
