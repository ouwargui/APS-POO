/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps.poo.pkgfor.real;

import aps.poo.pkgfor.real.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GuilhermeSantos
 */
public class GerenciaCliente {
    
    private ArrayList<Cliente> listaClientes;
    private static GerenciaCliente instanciaUnica;

    public static synchronized GerenciaCliente getInstance(){
        if(instanciaUnica == null)
            instanciaUnica = new GerenciaCliente();
        return instanciaUnica;
    }
    
    private GerenciaCliente(){
        this.listaClientes = new ArrayList<Cliente>();
    }

    public ArrayList<Cliente> getListaClientes() {
        return this.listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    public void adicionar(Cliente cliente) {
        this.listaClientes.add(cliente);
    }

    public boolean existeCpf(Cliente cliente) {
        return listaClientes.stream().anyMatch((listaCliente) -> (listaCliente.getCpf().equalsIgnoreCase(cliente.getCpf())));
    }
}
