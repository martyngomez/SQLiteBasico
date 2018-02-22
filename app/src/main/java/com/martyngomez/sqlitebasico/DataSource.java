package com.martyngomez.sqlitebasico;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by MTN on 22/02/2018.
 */

public class DataSource {
    SQLiteOpenHelper dbhelper;
    SQLiteDatabase database;

    private static final String [] allcollumns = {
            ProductosSQLiteOpenHelper.COLUMN_ID,
            ProductosSQLiteOpenHelper.COLUMN_PRICE,
            ProductosSQLiteOpenHelper.COLUMN_PRICE
    };

    public DataSource(Context context){
        dbhelper = new ProductosSQLiteOpenHelper(context);
    }

    public void open(){
        database = dbhelper.getWritableDatabase();
    };

    public void close (){
        dbhelper.close();
    }
}
