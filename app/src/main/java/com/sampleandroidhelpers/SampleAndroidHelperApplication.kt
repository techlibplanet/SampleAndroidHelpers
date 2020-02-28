package com.sampleandroidhelpers

import android.app.Application
import com.androidhelpers.SharedPrefKeys.PREFS_KEY
import java.lang.Appendable

class SampleAndroidHelperApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        if (PREFS_KEY == "null"){
            PREFS_KEY = "shared_prefs_key"
        }
    }
}