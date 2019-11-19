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

        this.setSaldo(this.saldo + quantia);

    }

    public boolean debitar(Double quantia) {
        boolean debito = false;

        if (this.saldo < quantia) {

            debito = true;
            this.setSaldo(this.saldo - quantia);
        }
        if (debito = true) {
            JOptionPane.showMessageDialog(null, "Débito confirmado");
        } else {
            JOptionPane.showMessageDialog(null, "Débito negado, Saldo indisponível");
        }
        return debito;
    }

    public boolean transferir(int numero, Double quantia) {
        boolean transferido = false;

        return transferido;
    }

    public String imprimir(){
        return "Cliente: "+ this.getCliente() + "Numero da Conta: " + this.getNumero() + "Data de Abertura: " + this.getDataAbertura() + "Saldo: " + this.getSaldo();
    }
}
