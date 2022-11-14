package com.example.tugasindividu3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;

public class WebpageActivity extends AppCompatActivity {
    WebView webView;
    WebSettings webSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webpage);

        webView=(WebView) findViewById(R.id.webview);
        webSettings=webView.getSettings();
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.instagram.com/p/CkdTK2QpHEE/");
        webSettings.setDomStorageEnabled(true);
        webSettings.setJavaScriptEnabled(true);

        ImageButton btnClose=(ImageButton) findViewById(R.id.btn_close);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backberanda = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(backberanda);
            }
        });
    }
}