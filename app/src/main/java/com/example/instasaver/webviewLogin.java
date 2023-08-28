package com.example.instasaver;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.webkit.CookieManager;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.example.instasaver.Pref.pref;
import com.example.instasaver.utils.textUtils;

public class webviewLogin extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        support only ligh theme
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_webview_login);
        webView = findViewById(R.id.webView);
        setupWebView();
        loadInstagramLoginPage();
    }
    @SuppressLint("SetJavaScriptEnabled")
    private void setupWebView() {
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                String url = request.getUrl().toString();
                // Check if the URL contains the desired cookie data
                if (url.contains("instagram.com")) {
                    String cookie = CookieManager.getInstance().getCookie(url);
                    new pref(getApplicationContext()).setCookie(cookie);
                    Toast.makeText(webviewLogin.this, "Login Successfully", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(webviewLogin.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                    Log.e("anyText", cookie);
                }
                return super.shouldOverrideUrlLoading(view, request);
            }
        });
        webView.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
                // Handle JavaScript alerts
                // You can customize the behavior here
                return super.onJsAlert(view, url, message, result);
            }

            @Override
            public boolean onJsConfirm(WebView view, String url, String message, JsResult result) {
                // Handle JavaScript confirm dialogs
                // You can customize the behavior here
                return super.onJsConfirm(view, url, message, result);
            }

            // You can override more methods like onJsPrompt() if needed
        });

    }
    public boolean onCreateOptionsMenu(android.view.Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu3,menu);
        return true;
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
//        Toast.makeText(this, ""+item, Toast.LENGTH_SHORT).show();
        if(item.getItemId() == R.id.update2){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(textUtils.UPDATE_URL));
            startActivity(intent);
//            Toast.makeText(this, "Update", Toast.LENGTH_SHORT).show();
            return super.onOptionsItemSelected(item);
        }
        return super.onOptionsItemSelected(item);
    }
    private void loadInstagramLoginPage() {
        webView.loadUrl(textUtils.INSTAGRAM_LOGIN);
    }
}