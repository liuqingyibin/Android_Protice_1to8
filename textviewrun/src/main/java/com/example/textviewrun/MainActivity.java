package com.example.textviewrun;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

import java.io.FileInputStream;

public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView acTextView;
    private MultiAutoCompleteTextView macTextView;
    private SharedPreferences sharedPreferences;
    private String[] res = {"beijing1", "beijing2", "beijing3", "shanghai1", "shanghai2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        acTextView = (AutoCompleteTextView) findViewById(R.id.auto);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, res);
        acTextView.setAdapter(adapter);
        sharedPreferences =(SharedPreferences) findViewById(R.id.multiAutoCompleteTextView);
        macTextView = (MultiAutoCompleteTextView) findViewById(R.id.multiAutoCompleteTextView);
        macTextView.setAdapter(adapter);
        macTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

        String FILE_NAME="fileText.txt";
        FileInputStream fis=openFileInput(FILE_NAME);
        byte[] readBytes=new Byte[fis.available()];
        b

    }
}
