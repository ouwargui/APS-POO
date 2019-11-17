/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps.poo.pkgfor.real;

import aps.poo.pkgfor.real.Cliente;
import aps.poo.pkgfor.real.InteracaoUsuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GuilhermeSantos
 */
public class GerenciaCliente {
    ArrayList<Cliente> listaCliente = new ArrayList<>();
    InteracaoUsuario interacaoUsuario = new InteracaoUsuario();

    public ArrayList<Cliente> getListaCliente(){
        return listaCliente;
    }

    public void adicionar(Cliente cliente) {
        this.listaCliente.add(cliente);
    }

    public String listar() {
      String listar = "";

      return listar;
    }

    public boolean existeCpf(Cliente cliente) {

    return true;
 }
}
