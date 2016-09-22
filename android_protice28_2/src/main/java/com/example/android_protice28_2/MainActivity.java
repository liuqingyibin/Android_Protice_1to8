package com.example.android_protice28_2;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "hylTag";
    private Button btnStart;
    private Button btnStop;
    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = (Button) findViewById(R.id.btnStart);
        btnStop = (Button) findViewById(R.id.btnStop);

        mediaPlayer = new MediaPlayer();
        btnStop.setEnabled(false);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Log.v(TAG, "start");
                    mediaPlayer.reset();

                    AssetManager assetManager = getAssets();
                    AssetFileDescriptor assetFileDescriptor = null;
                    try {
                        assetFileDescriptor = assetManager.openFd("stronger.mp3");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    mediaPlayer.setDataSource(assetFileDescriptor.getFileDescriptor());
                    mediaPlayer.prepare();
                    mediaPlayer.start();

                    btnStop.setEnabled(true);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
     /*   btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp=MediaPlayer.create(this,R.raw.music);
                mp.start();
            }
        })*/
    }
}
