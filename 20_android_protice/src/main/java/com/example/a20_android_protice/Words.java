package com.example.a20_android_protice;

import android.provider.BaseColumns;

/**
 * Created by Administrator on 2016/10/7.
 */
public class Words {
    public Words() {
    }

    public static abstract class Word implements BaseColumns {
        public static final String TABLE_NAME = "words";
        public static final String COLUMN_NAME_WORD = "word";//列：单词
        public static final String COLUMN_NAME_MEANING = "meaning";//列：单词含义
        public static final String COLUMN_NAME_SAMPLE = "sample";//单词示例

    }

}
