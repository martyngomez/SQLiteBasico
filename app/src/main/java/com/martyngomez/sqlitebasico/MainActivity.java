package com.martyngomez.sqlitebasico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button all, delete;
    EditText texto;
    ListView lista;
    List <Producto> listaProductos;
    DataSource dataSource;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        all = (Button) findViewById(R.id.all);
        delete = (Button) findViewById(R.id.delete);
        texto = (EditText) findViewById(R.id.texto);
        lista = (ListView) findViewById(R.id.lista);

        dataSource = new DataSource(this);
        dataSource.open();
        crearProductos();


        all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    public void crearProductos()
    {

        dataSource.create(new Producto(1, "TV",15000));
        dataSource.create( new Producto(2, "Notebook",18000));
        dataSource.create( new Producto(3, "Heladera",10000));
        dataSource.create( new Producto(4, "Tablet",2000));
        dataSource.create( new Producto(5, "Celular",10000));
        dataSource.create( new Producto(6, "Chromecast",2000));
        dataSource.create( new Producto(7, "Microhondas",5000));
        dataSource.create( new Producto(8, "Horno",8000));
        Log.i("Crear Productos", "Productos insertados");
    }

    
}
