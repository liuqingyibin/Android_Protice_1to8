package com.example.android_protice191;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnWrite = (Button) findViewById(R.id.btnWrite);
        Button btnRead = (Button) findViewById(R.id.btnRead);
        btnWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
                        File sdDire = Environment.getExternalStorageDirectory();
                        FileOutputStream outFileStream = new FileOutputStream(sdDire.getCanonicalPath() + "/test.txt");
                        String content = "Hello word";
                        outFileStream.write(content.getBytes(StandardCharsets.UTF_8));
                        outFileStream.close();
                        Toast.makeText(MainActivity.this, content.toString(), Toast.LENGTH_LONG).show();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
        btnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "112", Toast.LENGTH_LONG).show();
            }
        });


    }
}
