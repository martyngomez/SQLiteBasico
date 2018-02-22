package com.martyngomez.sqlitebasico;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by MTN on 22/02/2018.
 */

public class ProductosSQLiteOpenHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "productos.db";
    private static final int DATA_BASE_VERSION = 1;

    public static final String CREATE_TABLE =
            "CREATE TABLE PRODUCTOS ( " +
                    "ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "NOMBRE TEXT," +
                    "PRECIO INTEGER )";

    public static final String DROP_TABLE = "DROP TABLE IF EXIST PRODUCTOS";

    public ProductosSQLiteOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATA_BASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE);
        Log.i("onCreate","Tabla productos creada");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL( DROP_TABLE);
        onCreate(sqLiteDatabase);

    }
}
