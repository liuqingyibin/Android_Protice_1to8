package com.example.a19_2_android_protice;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class MainActivity extends AppCompatActivity {
    private final static String MyFileName = "Mefile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnWrite = (Button) findViewById(R.id.btnwrite);
        Button btnRead = (Button) findViewById(R.id.btnread);

        btnWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              /*  try {
                    if (Util.isExternalStorageWritable()) {
                        FileOutputStream fos=openFileOutput("file.txt", Context.MODE_PRIVATE);
                        String content ="Write to SD";
                        fos.write(content.getBytes(StandardCharsets.UTF_8));
                        fos.flush();
                        fos.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }*/

                OutputStream out = null;
                try {
                    if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
                        File file = Environment.getExternalStorageDirectory();
                        File myfile = new File(file.getCanonicalPath() + "/" + MyFileName);

                        FileOutputStream fileOutputStream = new FileOutputStream(myfile);
                        out = new BufferedOutputStream(fileOutputStream);
                        String content = "hello world";
                        try {
                            out.write(content.getBytes(StandardCharsets.UTF_8));
                        } finally {
                            if (out != null)
                                out.close();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });

        btnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*try {
                    FileInputStream fis;
                    fis=openFileInput("file.txt");
                    byte[] buffer=new byte[1024];
                    fis.read(buffer);
                    Toast.makeText(MainActivity.this,fis.toString(),Toast.LENGTH_LONG).show();
                    fis.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }*/

                InputStream in = null;
                try {

                    if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
                        File file = Environment.getExternalStorageDirectory();
                        File myfile = new File(file.getCanonicalPath() + "/" + MyFileName);
                        FileInputStream fileInputStream = new FileInputStream(myfile);
                        in = new BufferedInputStream(fileInputStream);

                        int c;
                        StringBuilder stringBuilder = new StringBuilder("");
                        try {
                            while ((c = in.read()) != -1) {
                                stringBuilder.append((char) c);
                            }
                            Toast.makeText(MainActivity.this, stringBuilder.toString(), Toast.LENGTH_LONG).show();
                        } finally {
                            if (in != null)
                                in.close();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });


    }
}
