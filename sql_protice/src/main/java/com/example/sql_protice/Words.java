package com.example.sql_protice;

import android.provider.BaseColumns;

/**
 * Created by Administrator on 2016/9/2.
 */
public class Words {
    public Words(){
        public static abstract class Word implements BaseColumns{
            public static final String TABLE_NAME="words";
            public static final String COLUNM_NAME_WORD="word";
            public static final String COLUMN_NAME_MEANING="meaning";
            public static final String CPLUMN_NAME_SAMPLE="sample";
        }
    }
}
