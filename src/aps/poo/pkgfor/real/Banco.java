    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps.poo.pkgfor.real;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GuilhermeSantos
 */
public class Banco {
    private List<Conta> listaConta = new ArrayList<>();
    
    
    public ArrayList<Conta> getListaConta(){}
    
    public void adicionarConta(Conta c) {};
    
    public String listar() {}
    
    public String pesquisar(int numero) {}
    
    public Conta getConta(int numero) {}
    
    public boolean remover(int numero) {}
}
