package aps.poo.pkgfor.real;

public class ContaEspecial extends Conta{

    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean debitar(Double quantia){
        boolean debito = false;
        Double saldoAtual = this.saldo;

        if (quantia <= limite - saldoAtual){
            debito = true;

            this.saldo = saldoAtual - quantia;
        }

        return debito;
    }

    public void imprimir(){

    }
}
