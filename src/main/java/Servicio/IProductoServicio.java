/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Producto;
import java.util.List;

/**
 *
 * @author Gus-Gus
 */
public interface IProductoServicio {
    
    public Producto crear(Producto producto);
    public Producto modificar(int codigoNuevo, Producto producto);
    public Producto eliminar(int codigoProducto);
    public Producto buscarPorCodigo(int codigoProducto);
    public int buscarPosicion(Producto producto);
    public List<Producto> listar();
    
}
