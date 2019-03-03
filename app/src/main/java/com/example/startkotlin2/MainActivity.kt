package com.example.startkotlin2

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myWebView = findViewById<View>(R.id.webview) as WebView

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            WebView.setWebContentsDebuggingEnabled(true)
        }

        val settings = myWebView.settings
        settings.javaScriptEnabled = true
        settings.domStorageEnabled = true

        myWebView.loadUrl("https://www.google.com/")
    }
}