package com.martyngomez.sqlitebasico;

import java.text.NumberFormat;

/**
 * Created by MTN-PC on 21/02/2018.
 */

public class Producto {
    int id;
    String nombre;
    int precio;

    public Producto() {
    }

    public Producto(int id, String nombre, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        return nombre + "\n" +  nf.format(precio);
    }
}
