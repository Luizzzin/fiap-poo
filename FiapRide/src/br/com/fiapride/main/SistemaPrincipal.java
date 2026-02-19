package br.com.fiapride.main;
import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {

    public static void main (String[] args){
        Passageiro passageiro1 = new Passageiro();
        passageiro1.nome= "Nathan";
        passageiro1.saldo = 100.50;

        Passageiro passageiro2 = new Passageiro();
        passageiro2.nome = "Luiz";
        passageiro2.saldo = 300.00;


        System.out.println("--Sistema do fiapride--");
        System.out.println("Passageiro: "+passageiro1.nome+" Saldo: "+passageiro1.saldo);
        System.out.println("Passageiro: "+passageiro2.nome+" Saldo: "+passageiro2.saldo);
    }

}
