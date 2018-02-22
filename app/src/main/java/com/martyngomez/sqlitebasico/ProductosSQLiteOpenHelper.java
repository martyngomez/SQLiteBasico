package com.martyngomez.sqlitebasico;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by MTN on 22/02/2018.
 */

public class ProductosSQLiteOpenHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "productos.db";
    private static final int DATA_BASE_VERSION = 1;

    public static final String TABLE_PRODUCTS = "productos";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAME = "nombre";
    public static final String COLUMN_PRICE = "precio";

    public ProductosSQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
