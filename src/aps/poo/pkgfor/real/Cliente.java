package aps.poo.pkgfor.real;

import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.JOptionPane;

public class Cliente {

    private static final AtomicInteger count = new AtomicInteger(0);

    public static AtomicInteger getCount() {
        return count;
    }

    private int numero;
    private String nome;
    private String cpf;
    private String telefone;


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = count.getAndIncrement();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Nome: " + this.nome + "\n CPF: " + this.cpf + "\n Telefone: " + this.telefone);
    }

}
