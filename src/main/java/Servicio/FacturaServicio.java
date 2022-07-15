/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Factura;
import Modelo.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gus-Gus
 */
public class FacturaServicio implements IFacturaServicio{
    
    private static List<Factura> facturaList = new ArrayList<>();

    @Override
    public Factura crear(Factura factura) {
         this.facturaList.add(factura);
         return factura;
    }

    public Factura modificar(int numeroNuevo, Factura facturaNuevo) {
        var posicion=this.buscarPosicion(this.buscarNFactura(numeroNuevo));
        this.listar().get(posicion).setUnCliente(facturaNuevo.getUnCliente());
        this.listar().get(posicion).setDireccion(facturaNuevo.getDireccion());
        this.listar().get(posicion).setUnProducto(facturaNuevo.getUnProducto());
        this.listar().get(posicion).setFecha(facturaNuevo.getFecha());
        this.listar().get(posicion).setTotal(facturaNuevo.getTotal());
        this.listar().get(posicion).setCantidad(facturaNuevo.getCantidad());
        return facturaNuevo;
    }

    @Override
    public Factura eliminar(int nuevoFactura) {
        Factura factura = this.buscarNFactura(nuevoFactura);
        var posicion = this.buscarPosicion(factura);
        this.listar().remove(posicion);
        return factura;
    }

    @Override
    public Factura buscarNFactura(int nuevoFactura) {
        Factura factura = null;
        for(var p:this.listar()){
            if(nuevoFactura==p.getNumFactura()){
                factura = p;
                break;
            }
        }
        return factura;
    }

    @Override
    public int buscarPosicion(Factura factura) {
        
        int posicion =-1;
        for(var p:this.facturaList){
            posicion++;
            if(p.getNumFactura()==factura.getNumFactura()){
                break;
            }
        }
        return posicion;
    }

    @Override
    public List<Factura> listar() {
        return this.facturaList;
    }

    @Override
    public Factura modificar(int numeroNuevo, Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
