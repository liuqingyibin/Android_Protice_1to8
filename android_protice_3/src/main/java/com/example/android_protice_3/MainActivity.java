package com.example.android_protice_3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

/*    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        TextView textView = (TextView) findViewById(R.id.textsex);

        switch (view.getId()) {
            case R.id.rbtn1:
                if (checked)
                    textView.setText("您的性别为男");
                break;
            case R.id.rbtn2:
                if (checked)
                    textView.setText("您的性别为女");
                break;
            case R.id.rbtn3:
                if (checked)
                    textView.setText("我靠  你竟然是人妖！");
                break;
        }
    }*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

