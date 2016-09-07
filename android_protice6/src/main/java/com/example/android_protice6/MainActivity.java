package com.example.android_protice6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.btn1);
        final TextView txtReault = (TextView) findViewById(R.id.text3);
        final TextView text1 = (TextView) findViewById(R.id.text1);
        final CheckBox checkBox1 = (CheckBox) findViewById(R.id.chbok1);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.chbok2);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.chbok3);
        final RadioButton radioButton = (RadioButton) findViewById(R.id.rbtn2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radioButton.isChecked())
                    txtReault.setText("你不喜欢安卓 ");
                else
                    txtReault.setText("你喜欢安卓 ");
                txtReault.setText(txtReault.getText() + "你喜欢的编译语言是");
                if (checkBox1.isChecked())
                    txtReault.setText(txtReault.getText() + "JAVA ");

                if (checkBox1.isChecked())
                    txtReault.setText(txtReault.getText() + "C ");

                if (checkBox1.isChecked())
                    txtReault.setText(txtReault.getText() + "Python ");

            }
        });


        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    txtReault.setText(txtReault.getText() + "JAVA");
                else
                    txtReault.setText(txtReault.getText());
            }

        });
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    txtReault.setText(txtReault.getText() + "C");
                else
                    txtReault.setText(txtReault.getText());
            }

        });
        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    txtReault.setText(txtReault.getText() + "Python");
                else
                    txtReault.setText(txtReault.getText());
            }

        });
        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    text1.setText("不喜欢也得学 啊哈哈！");
                else
                    text1.setText("喜欢就好好学 嗯！");
            }
        });
    }

}

