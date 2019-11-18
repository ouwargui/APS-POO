package aps.poo.pkgfor.real;

import javax.swing.JOptionPane;

public class Conta {

    private static int count = 0;
    private int numero;
    private String cliente;
    private String DataAbertura;
    protected double saldo;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Conta.count = count;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
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
        return "Cliente: "+cliente.toString() + "Numero da Conta: " + numero + "Data de Abertura: " + DataAbertura + "Saldo: " + saldo;
    }
}
