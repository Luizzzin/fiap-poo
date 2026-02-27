package MeuObjeto.model;

public class Estojo {
    public String material;
    public String formato;
    public double capacidadeEmMl;
    public boolean ziper;

    public Estojo(String material, String formato, double capacidadeEmMl, boolean ziper){
        this.material = material;
        this.formato = formato;
        this.capacidadeEmMl = capacidadeEmMl;
        this.ziper = true;
    }
    public void abrir(){
        if (ziper = true){
            System.out.println("Seu estojo ja esta aberto!!");
            return;
        }
        this.ziper = true;
        System.out.println("abrindo estojo, zooooooop!");
    }
    public void fechar(){
        if (ziper = false){
            System.out.println("Seu estojo ja esta fechado!");
            return;
        }
        this.ziper = false;
        System.out.println("Fechando estojo!! Zuuuuuump!");
        return;
    }
}
