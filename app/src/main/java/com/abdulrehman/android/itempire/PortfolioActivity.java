package com.abdulrehman.android.itempire;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class PortfolioActivity extends AppCompatActivity {


    WebView webView;

    WebSettings webSettings;

    android.support.v7.widget.Toolbar toolbar;

    String Url = "http://itempire.net/index.php?display=portfolio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);



        toolbar = findViewById(R.id.toolbar);
        webView = findViewById(R.id.webview3);


        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Portfolio");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        WebSettings webViewSettings = webView.getSettings();
        webViewSettings.setJavaScriptEnabled(true);
        webView.loadUrl(Url);
    }
}

