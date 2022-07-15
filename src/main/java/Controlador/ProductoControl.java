/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Factura;
import Modelo.Producto;
import Servicio.FacturaServicio;
import Servicio.ProductoServicio;
import java.util.List;

/**
 *
 * @author Gus-Gus
 */
public class ProductoControl {
    
    private ProductoServicio productoServicio = new ProductoServicio();
    
    
    public Producto crearProducto(String[]args){
        
        Producto producto = new Producto(args[0], args[1], Integer.valueOf(args[2]), Integer.valueOf(args[3]), Integer.valueOf(args[4]), Integer.valueOf(args[5]));
        this.productoServicio.crear(producto);
        return producto;
    }
    public Producto buscarProducto(String arg){
        return this.productoServicio.buscarPorCodigo(Integer.valueOf(arg));
        
    }
    public Producto eliminar(String arg){
        return this.productoServicio.eliminar(Integer.valueOf(arg));
    }
    public Producto modificarProducto(String[]args){
        
        Producto productoNuevo = new Producto(args[0], args[1], Integer.valueOf(args[2]), Integer.valueOf(args[3]), Integer.valueOf(args[4]), Integer.valueOf(args[5]));
        this.productoServicio.crear(productoNuevo);
        return productoNuevo;
    }
    public List<Producto> listar(){
        return this.productoServicio.listar();
    }
}
