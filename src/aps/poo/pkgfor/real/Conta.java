package aps.poo.pkgfor.real;

import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.JOptionPane;

public class Conta {

    
    private int numero;
    private int cliente;
    private String DataAbertura;
    protected double saldo;
    
    private static final AtomicInteger count = new AtomicInteger(1);

    public static AtomicInteger getCount() {
        return count;
    }
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = count.getAndIncrement();
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public String getDataAbertura() {
        return DataAbertura;
    }

    public void setDataAbertura(String DataAbertura) {
        this.DataAbertura = DataAbertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(Double quantia) {
        this.setSaldo(this.getSaldo() + quantia);
    }
    
    public boolean ehPossivelDebito(double quantia){
        return this.getSaldo() > quantia;
    }

    public boolean debitar(double quantia) {
        if(ehPossivelDebito(quantia)){
            this.setSaldo(this.getSaldo() - quantia);
            return true;
        }else{
            return false;
        }
    }

    public boolean transferir(Conta conta, Double quantia) {
        if(debitar(quantia)){
            conta.setSaldo(conta.getSaldo() + quantia);
            return true;
        }else{
            return false;
        }
    }

    public String imprimir(){
        return "Cliente: "+ this.getCliente() + "Numero da Conta: " + this.getNumero() + "Data de Abertura: " + this.getDataAbertura() + "Saldo: " + this.getSaldo();
    }
}
