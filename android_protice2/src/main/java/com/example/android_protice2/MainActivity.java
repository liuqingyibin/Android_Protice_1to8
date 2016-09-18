package com.example.android_protice2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private final String tag = "MyTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String strMag = "hi";
        Log.v(tag, "Verbose Message");
        Log.d(tag, "Debug Message");
        Log.i(tag, "Info Message");
        Log.w(tag, "Warning Message");
        Log.e(tag, "Error Message");
        Button button = (Button) findViewById(R.id.qwe);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
