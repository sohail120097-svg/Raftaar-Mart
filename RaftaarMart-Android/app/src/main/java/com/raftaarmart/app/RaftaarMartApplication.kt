package com.raftaarmart.app

import android.app.Application
import android.webkit.WebView

class RaftaarMartApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // Enable WebView debugging in debug builds
        WebView.setWebContentsDebuggingEnabled(true)
    }
}
