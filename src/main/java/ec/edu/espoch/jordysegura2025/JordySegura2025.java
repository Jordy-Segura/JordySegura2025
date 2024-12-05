/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.jordysegura2025;

import ec.edu.espoch.jordysegura2025.clases.Clientes;
import ec.edu.espoch.jordysegura2025.clases.Pedidos;
import ec.edu.espoch.jordysegura2025.clases.Productos;
import ec.edu.espoch.jordysegura2025.enumeraciones.Categorias;

/**
 *
 * @author jordy
 */
public class JordySegura2025 {

    public static void main(String[] args) {
        Productos objProducto1=new Productos();
        Productos objProducto2=new Productos();
        Clientes cliente1=new Clientes();
        Pedidos pedido=new Pedidos();
        
        cliente1.setNombre("Jordy");
                    
        objProducto1.setNombre("Arroz");
        objProducto1.setPrecio(5.25);
        objProducto1.setCategoria(Categorias.ALIMENTO);      
        
        objProducto2.setNombre("Coca Cola");
        objProducto2.setPrecio(3.75);
        objProducto2.setCategoria(Categorias.BEBIDA);
        
        objProducto1.mostrarDetallesProducto1(objProducto1);
        objProducto2.mostrarDetallesProducto2(objProducto2);
        
        pedido.relacionClienteProduto(cliente1, objProducto1);
        
    }
}
