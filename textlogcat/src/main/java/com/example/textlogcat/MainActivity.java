package com.example.textlogcat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(tag, "VerboseMessage");
        Log.d(tag, "DebugMessage");
        Log.i(tag, "Info Message");
        Log.w(tag, "Warning Message");
        Log.e(tag, "Error Message");


    }
}
