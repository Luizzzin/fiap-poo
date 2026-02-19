package MeuObjeto.main;
import MeuObjeto.model.Estojo;

public class VerificarObj {
    public static void main(String[] args){

        Estojo estojo1 = new Estojo();
        estojo1.material = "plastico";
        estojo1.formato= "Cilindrico";
        estojo1.capacidadeEmMl= 100.00;

        System.out.println("Meu objeto é um estojo, seu formato é:"+estojo1.formato+" feito de "+estojo1.material);
        System.out.println("a capacidade do meu objeto é: "+estojo1.capacidadeEmMl+" ML");
    }
}
