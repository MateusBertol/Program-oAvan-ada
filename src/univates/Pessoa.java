/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univates;

/**
 *
 * @author yuri.schmitz
 */
public class Pessoa {
   
    private String nome;
    private int conta;
    private double saldo;
    private double debito;
    private double recebeu;

    
    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    public double getRecebeu() {
        return recebeu;
    }

    public void setRecebeu(double recebeu) {
        this.recebeu = recebeu;
    }
    
    
    public String toString(){
        return "Nome: " + this.nome +"\nConta: " + this.conta + "\nSaldo: " + this.saldo + "\nDepositou: " + this.debito + "\nRecebeu: " + this.recebeu + "\n-------------------";
    }
}
