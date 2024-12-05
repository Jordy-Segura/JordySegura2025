/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.jordysegura2025.clases;

/**
 *
 * @author jordy
 */
public class Clientes {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void nombreCliente(Clientes cliente1){
        System.out.println("Nombre Cliente: "+cliente1.getNombre());
    }
}
