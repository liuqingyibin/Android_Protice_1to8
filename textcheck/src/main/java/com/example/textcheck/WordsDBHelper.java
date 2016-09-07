package com.example.textcheck;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2016/9/2.
 */
public class WordsDBHelper extends SQLiteOpenHelper{
    private final static String DATABASE_NAME="wordsdb";
    private final  static int DATABASE_VERSION=1;

    private  final  static String SQL_CREATE_DATABASE="CREAT TABLE"+Words.Word.TABLE_NAME+
            "("+Words.Word.ID+"INTEGER PRIMARY KEY AUTOINCREMENT,"+
            Words.Word.COLUMN_NAME_WORD+"TEXT"+","
            +Words.Word.COLUMN_NAME_SAMPLE+"TEXT"+")";
    public void onCreate(SQLiteDatabase sqLiteDatabase){
        sqLiteDatabase.execSQL(SQL_CREATE_DATABASE);
    }
}
