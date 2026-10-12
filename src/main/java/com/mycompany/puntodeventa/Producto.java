package com.mycompany.puntodeventa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumnog
 */
public class Producto {
    String nombre;
    String marca;
    double precio;
    int stock;

    public Producto() {
    }

    public Producto(String nombre, String marca, double precio, int stock) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", marca=" + marca + ", precio=" + precio + ", stock=" + stock + '}';
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
