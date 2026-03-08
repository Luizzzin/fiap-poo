package br.com.fiapride.main;
import br.com.fiapride.model.Passageiro;

public class Main {

    public static void main (String[] args){
        Passageiro passageiro1 = new Passageiro("luiz","123");
        passageiro1.adicionarSaldo(44.4);

        Passageiro passageiro2 = new Passageiro("nathan","124");
        passageiro2.adicionarSaldo(30.0);


        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Passageiro: " + passageiro1.getNome() + " | Saldo: R$ " + passageiro1.getSaldo() + " | CPF: " + passageiro1.getCpf());
        System.out.println("Passageiro: " + passageiro2.getNome() + " | Saldo: R$ " + passageiro2.getSaldo() + " | CPF: " + passageiro2.getCpf());

        System.out.println("Pagando viagem do passageiro 1");
        passageiro1.pagarViagem(30);
        System.out.println("Pagando viagem do passageiro 2");
        passageiro2.pagarViagem(30);
    }

}
