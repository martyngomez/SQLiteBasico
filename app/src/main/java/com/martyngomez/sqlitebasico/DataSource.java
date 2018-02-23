package com.martyngomez.sqlitebasico;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MTN on 22/02/2018.
 */

public class DataSource {
    SQLiteOpenHelper dbhelper;
    SQLiteDatabase database;

    private static final String [] allcollumns = {
            ProductosOpenHelper.COLUMN_ID,
            ProductosOpenHelper.COLUMN_NAME,
            ProductosOpenHelper.COLUMN_PRICE
    };

    public DataSource(Context context){
        dbhelper = new ProductosOpenHelper(context);
    }

    public void open(){
        database = dbhelper.getWritableDatabase();
    };

    public void close (){
        dbhelper.close();
    }


    public void create (Producto producto){
        ContentValues contentValues = new ContentValues();
        contentValues.put ( "nombre" , producto.getNombre() );
        contentValues.put ( "precio",  producto.getPrecio() );
        database.insert("productos",null,contentValues);

    }

    public List<Producto> findAll(){
        Cursor cursor = database.query(ProductosOpenHelper.TABLE_PRODUCTS,allcollumns   , null,null,null,null,null );
        List<Producto> productos = cursorToList (cursor);
        return productos;
    }


    public List <Producto> cursorToList (Cursor cursor){
        List<Producto> productos = new ArrayList<Producto>();
        if (cursor.getCount()>0){
            while (cursor.moveToNext()) {
                Producto producto = new Producto();
                producto.setId(cursor.getInt(cursor.getColumnIndex(ProductosOpenHelper.COLUMN_ID)));
                producto.setNombre(cursor.getString(cursor.getColumnIndex(ProductosOpenHelper.COLUMN_NAME)));
                producto.setPrecio(cursor.getInt(cursor.getColumnIndex(ProductosOpenHelper.COLUMN_PRICE)));
                productos.add(producto);
            }
        }
        return productos;
    }


}
