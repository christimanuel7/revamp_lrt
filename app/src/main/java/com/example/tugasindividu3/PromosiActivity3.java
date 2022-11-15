package com.example.tugasindividu3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PromosiActivity3 extends AppCompatActivity {
    WebView webView;
    WebSettings webSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promosi3);

        webView= findViewById(R.id.webview);
        webSettings=webView.getSettings();
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(getString(R.string.link_promosi3));
        webSettings.setDomStorageEnabled(true);
        webSettings.setJavaScriptEnabled(true);

        ImageButton btnClose= findViewById(R.id.btn_close);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backberanda = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(backberanda);
            }
        });
    }
}