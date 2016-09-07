package com.example.textcheck;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox;

    private RadioGroup rg;

    private ArrayList<Map<String, String>>getAll(){
        SQLiteDatabase db=mDbHelper.getReadableDatabase();
    }
    public boolean isExternalStorageWritable(){
        String state= Environment.getExternalStorageState();
        if(Environment.MEDIA_MOUNTED.equals(state)){
            return true;
        }
        return false;
    }

    private Button btnWrite;
    private Button btnaRead;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnWrite=(Button) findViewById(R.id.btnwrite);
        btnaRead=(Button) findViewById(R.id.btnread);



        btnWrite.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                OutputStream out=null;
                try{
                    if(Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)){
                        File file=Environment.getExternalStorageDirectory();
                        File myfile=new File(file.getCanonicalPath()+"/"+MyFile);
                        FileOutputStream fileOutputStream=new FileOutputStream(myfile);
                        out =new BufferedOutputStream(fileOutputStream);
                        String content="hello world";
                        try{
                            out.write(content.getBytes(StandardCharsets.UTF_8));

                        }finally {
                            if(out!=null)
                                out.close();
                        }
                    }
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        rg = (RadioGroup) findViewById(R.id.RadioGroup1);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                                          @Override
                                          public void onCheckedChanged(RadioGroup group, int checkedId) {
                                              switch (checkedId) {
                                                  case R.id.radioButton1:
                                                      Log.i("tag", "喜欢就好好学Adroid");
                                                      break;
                                                  case R.id.radioButton2:
                                                      Log.i("tag", "不喜欢也没办法");
                                                      break;
                                              }
                                          }
                                      }
        );
        checkBox = (CheckBox) findViewById(R.id.checkBox);

        //设置监听事件进行处理
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //通过这个方法来监听checkBox方法选中
                if (isChecked) {
                    //get checkBox 文本内容
                    String text = checkBox.getText().toString();
                    Log.i("tag", text);
                }

            }
        });

    }
}
