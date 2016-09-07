package com.example.sql_protice;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2016/9/2.
 */
public class WordsDBHelper extends SQLiteOpenHelper{
    private final static String DATABASE_NAME="wordsdb";
    private final static int DATABASE_VARSION=1;

    private final static String SQL_CREATE_DATABASE="CREATETABLE"+Words.Word.TABLE_NAME+"("+
            Words.Word.ID+"INTEGER PRIMARYKER AUTOINCREMENT,"+
            Words.Word.COLUMN_NAME_WORD+"TEXT"+","+
            Words.Word.COLUMN_NAME_MEANING+"TEXT"+","
            +Words.Word.COLUMN_NAME_SAMPLE+"TEXT"+")";

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_DATABASE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_DATABASE);
        onCreate(db);
    }
}
