/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps.poo.pkgfor.real;

import static java.time.temporal.TemporalQueries.localDate;

/**
 *
 * @author GuilhermeSantos
 */
public class Conta {
    private int numero;
    protected double saldo;
    
    public void depositar(double quantia){}
    
    public boolean debitar(double quantia){}
    
    public boolean transferir(Conta destino, double quantia){}
    
    public void imprimir(){}
}
