package com.example.android_protice8to11;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "LIFECYCLE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "(1)onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "(2)onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "(7)onRestart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "(5)onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "(6)onDestroy()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "(4)onPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "(3)onResume()");
    }

}
