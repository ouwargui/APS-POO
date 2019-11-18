    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps.poo.pkgfor.real;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author GuilhermeSantos
 */
public class Banco {
    
    
    private ArrayList<Conta> listaContas;
    private static Banco instanciaUnica;
    
    public Banco(){
        this.listaContas = new ArrayList<Conta>();
    }

    public ArrayList<Conta> getListaContas() {
        return this.listaContas;
    }

    public void setListaContas(ArrayList<Conta> listaContas) {
        this.listaContas = listaContas;
    }
    
    public void adicionar(Conta conta){
        this.listaContas.add(conta);
    }
    
    public String listar(){
        return "testes";
    }
    
    public static synchronized Banco getInstance(){
        if(instanciaUnica == null)
            instanciaUnica = new Banco();
        return instanciaUnica;
    }
    
    public String pesquisar(int numero){    
        for (Conta conta : listaContas) {
            if (conta.getNumero()== numero) 
            {
                return conta.imprimir();
            }
        }
        return "Conta pesquisada não existe"; 
    }
    
    public Conta getConta(int numero){
        for (Conta conta : listaContas) {
            if (conta.getNumero()== numero) 
            {
                return conta;
            }
        }
        return null; 
    }
    
    public boolean remover(int numero){
        Iterator<Conta> iteratorContas = this.getListaContas().iterator();
        
        while(iteratorContas.hasNext()){
            Conta conta = iteratorContas.next();
            
            if(conta.getNumero() == numero){
                iteratorContas.remove();
                return true;
            }
        }
        return false;
    }
}
