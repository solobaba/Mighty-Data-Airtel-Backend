package com.example.mighty.mightydataairtelbackend;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataDBHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "BalanceDB.db";
    private static final String TABLE_NAME = "DataBalance";
    private static final String KEY_ID = "id";
    private static final String KEY_TIME = "time";
    public static final String KEY_TEXT = "text";

    public DataDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_DATABALANCE_TABLE = "CREATE TABLE " + TABLE_NAME + "("
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + KEY_TIME + " INTEGER, " + KEY_TEXT + " TEXT )";

        db.execSQL(CREATE_DATABALANCE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
