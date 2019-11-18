/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps.poo.pkgfor.real;

/**
 *
 * @author GuilhermeSantos
 */
public class ContaEspecial extends Conta {
    
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public boolean possivelDebito(double quantia){
        if(quantia <= this.getSaldo() + this.getLimite()){
            return true;
        }
        return false;
    }
    
    /**
     *
     * @param quantia
     * @return
     */
    @Override
    public boolean debitar(double quantia){
        if(possivelDebito(quantia)){
            double saldoResultante = this.getSaldo() - quantia;
            this.setSaldo(saldoResultante);
            return true;
        }
        return false;
        
    }
}
