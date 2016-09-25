package com.example.android_protice28_2;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "hylTag";
    private Button btnStart;
    private Button btnStop;
    private Button btnPause;
    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = (Button) findViewById(R.id.btnStart);
        btnStop = (Button) findViewById(R.id.btnStop);
        btnPause = (Button) findViewById(R.id.btnPause);

        mediaPlayer = new MediaPlayer();
        btnStop.setEnabled(false);
        btnPause.setEnabled(false);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Log.v(TAG, "start");
                    mediaPlayer.reset();

                    AssetManager assetManager = getAssets();

                    AssetFileDescriptor assetFileDescriptor = assetManager.openFd("stronger.mp3");
                    mediaPlayer.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                    Toast.makeText(MainActivity.this, "开始", Toast.LENGTH_LONG).show();
                    mediaPlayer.prepare();
                    mediaPlayer.start();

                    btnStop.setEnabled(true);
                    btnPause.setEnabled(true);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        //暂停按钮
        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer.isPlaying()) {
                    btnPause.setText("继续");
                    mediaPlayer.pause();
                } else {
                    btnPause.setText("暂停");
                    mediaPlayer.start();
                }
            }
        });
        //停止按钮
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                btnPause.setText("暂停");
                btnPause.setEnabled(false);
                btnStop.setEnabled(false);
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
