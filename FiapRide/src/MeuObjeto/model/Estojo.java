package MeuObjeto.model;

public class Estojo {
    public String material;
    public String formato;
    public double capacidadeEmMl;
    public boolean estado = true;

    public Estojo(String material, String formato, double capacidadeEmMl){
        this.material = material;
        this.formato = formato;
        this.capacidadeEmMl = capacidadeEmMl;
    }
    public void abrir(){
        if (estado = true){
            System.out.println("Seu estojo ja esta aberto!!");
            return;
        }
        estado = true;
        System.out.println("abrindo estojo, zooooooop!");
    }
    public void fechar(){
        if (estado = false){
            System.out.println("Seu estojo ja esta fechado!");
            return;
        }
        estado = false;
        System.out.println("Fechando estojo!! Zuuuuuump!");
        return;
    }
}
