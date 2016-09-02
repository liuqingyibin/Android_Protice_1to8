package com.example.textcheck;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox;

    private RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
