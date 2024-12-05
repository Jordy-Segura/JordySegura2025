/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.jordysegura2025.clases;

import ec.edu.espoch.jordysegura2025.enumeraciones.Categorias;

/**
 *
 * @author jordy
 */
public class Productos {
    private String nombre;
    private double precio;
    private Categorias categoria;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }
    
    public void mostrarDetallesProducto1(Productos objProducto1){
        System.out.println("Nombre del producto 1: "+objProducto1.getNombre());
        System.out.println("Categoria: "+objProducto1.getCategoria());
        System.out.println("Precio sin IVA: "+objProducto1.getPrecio());
        System.out.println("Precio total del producto con el IVA es: "+(objProducto1.getPrecio()+(objProducto1.getPrecio()*0.15)));
        System.out.println(" ");
        
    }
    
    public void mostrarDetallesProducto2(Productos objProducto2){
        System.out.println("Nombre del producto 2: "+objProducto2.getNombre());
        System.out.println("Categoria: "+objProducto2.getCategoria());
        System.out.println("Precio sin IVA: "+objProducto2.getPrecio());
        System.out.println("Precio total del producto con el IVA es: "+(objProducto2.getPrecio()+(objProducto2.getPrecio()*0.15)));
        System.out.println(" ");
        
    }
}
