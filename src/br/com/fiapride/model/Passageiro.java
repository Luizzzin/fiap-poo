package br.com.fiapride.model;

public class Passageiro {

    private String nome;
    private String cpf;
    private double saldo;

    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = (0);
    }

    public String getNome() {
        return this.nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return this.saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void adicionarSaldo(double valor){
        if (valor <= 0){
            System.out.println("Valor menos ou igual a zerro ERRO");
            return;
        }
        this.saldo += valor;
        System.out.println("saldo adicionado"+this.saldo);
        return;
    }
    public void pagarViagem (double custo){
        if (this.saldo < custo){
            System.out.println("ERRO saldo insulficiente");
            return;
        }
        this.saldo -= custo;
        System.out.println("viagem paga| seu novo valor de saldo é ");
        System.out.format("%.2f \n",(double)this.saldo);
    }
}

