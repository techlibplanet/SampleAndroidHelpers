package com.sampleandroidhelpers

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.androidhelpers.SharedPreferenceProvider

class MainActivity : AppCompatActivity() {

    private lateinit var sharedPreferenceProvider: SharedPreferenceProvider
    private val TAG = MainActivity::class.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sharedPreferenceProvider = SharedPreferenceProvider(this)

        sharedPreferenceProvider.putPref(FIRST_NAME, "Android")
        sharedPreferenceProvider.putPref(LAST_NAME, "Helpers")

        Log.d(TAG, sharedPreferenceProvider.getPref(FIRST_NAME, DEFAULT))

        Log.d(TAG, sharedPreferenceProvider.getPref(LAST_NAME, DEFAULT))
    }

    companion object {
        const val FIRST_NAME = "first_name"
        const val LAST_NAME = "last_name"
        const val DEFAULT = ""
    }
}
