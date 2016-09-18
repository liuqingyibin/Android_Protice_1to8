package com.example.android_protice7;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("这事一个普通的对话框").setTitle("对话框");
                builder.show();
            }
        });
        Button button = (Button) findViewById(R.id.btn2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                LayoutInflater inflater = getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.login_dialog, null);
                builder.setView(dialogView);
                builder.setTitle("Login");

                builder.setPositiveButton("登录", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        EditText text_username = (EditText) dialogView.findViewById(R.id.editTextUserId);
                        EditText text_password = (EditText) dialogView.findViewById(R.id.editTextPassword);
                        String username = text_username.getText() + "";
                        String password = text_password.getText() + "";
                        if (username.equals("abc") && password.equals("123"))
                            Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
                        else
                            Toast.makeText(MainActivity.this, "登录失败", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {


                        Toast.makeText(MainActivity.this, "取消登录", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.show();
            }
        });
    }
}
