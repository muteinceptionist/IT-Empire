package com.abdulrehman.android.itempire;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class SkillsActivity extends AppCompatActivity {

    WebView webView;

    WebSettings webSettings;

    android.support.v7.widget.Toolbar toolbar;

    String Url = "http://skills.itempire.net/index.php?display=skills";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);



        toolbar = findViewById(R.id.toolbar);
        webView = findViewById(R.id.webview7);


        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Skills");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        WebSettings webViewSettings = webView.getSettings();
        webViewSettings.setJavaScriptEnabled(true);
        webView.loadUrl(Url);
    }
}
