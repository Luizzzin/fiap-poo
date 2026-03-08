package MeuObjeto.main;
import MeuObjeto.model.Estojo;

public class VerificarObj {
    public static void main(String[] args){

        Estojo estojo1 = new Estojo("plastico", "cilindrico");

        System.out.println("Seu estojo é de "+estojo1.getMaterial());
        System.out.println("Seu estojo é do formato: "+estojo1.getFormato());
        estojo1.fechar();
        estojo1.colocarMaterial(100);
        System.out.println("Vamos abrir seu estojo");
        estojo1.abrir();
        estojo1.colocarMaterial(300.2);
        estojo1.colocarMaterial(200.1);
        estojo1.tirarMaterial(200.1);
        estojo1.fechar();
    }
}
