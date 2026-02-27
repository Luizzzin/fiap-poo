package MeuObjeto.main;
import MeuObjeto.model.Estojo;

public class VerificarObj {
    public static void main(String[] args){

        Estojo estojo1 = new Estojo("plastico", "cilindrico", 100.0, false);

        System.out.println("Seu estojo é de "+estojo1.material);
        System.out.println("Seu estojo é do formato: "+estojo1.formato);
        System.out.println("Seu estojo tem a capacidade em ML de: "+estojo1.capacidadeEmMl);
        System.out.println("Vamos abrir seu estojo");
        estojo1.abrir();
        System.out.println("agora vamos abrir!!");
        estojo1.fechar();
    }
}
