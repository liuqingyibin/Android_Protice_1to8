package com.example.android_protice15;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.activity_main_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        /*        String phonenumber="18518767898";
                String encoderPhonenumber=null;
                try{
                    encoderPhonenumber= URLEncoder.encode(phonenumber,"UTF-8");
                }catch (UnsupportedEncodingException e){
                    e.printStackTrace();
                }
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+encoderPhonenumber)));*/

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:13800138000"));
                startActivity(intent);

            }
        });
    }
}
