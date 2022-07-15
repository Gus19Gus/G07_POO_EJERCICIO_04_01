/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import Servicio.ClienteServicio;
import java.util.List;

/**
 *
 * @author Gus-Gus
 */
public class ClienteControl {
    
    private ClienteServicio clienteServicio = new ClienteServicio();
    
    public Cliente crearCliente(String [] args){
        Cliente cliente = new Cliente(Integer.valueOf(args[0]), args [1], args[2], args[3], Integer.valueOf(args[4]), args[5]);
        this.clienteServicio.crear(cliente);
        return cliente;
    }
    
    public Cliente buscarCliente(String arg){
        return this.clienteServicio.buscarPorCedula(Integer.valueOf(arg));
    }
    
    public Cliente eliminar(String arg){
        return this.clienteServicio.eliminar(Integer.valueOf(arg));
    }
    public Cliente modificar(String []args){
        Cliente clienteNuevo = new Cliente(Integer.valueOf(args[0]), args [1], args[2], args[3], Integer.valueOf(args[4]), args[5]);
        this.clienteServicio.modificar(Integer.valueOf(args[0]), clienteNuevo);
        return clienteNuevo;
    }
    public List<Cliente> listar(){
        return this.clienteServicio.listar();
    }
}
