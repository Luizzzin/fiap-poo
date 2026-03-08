package MeuObjeto.model;

public class Estojo {

    private String material;
    private String formato;
    private double volumeAtual;
    private static final double CAPACIDADE_MAXIMA = 400.0;
    private boolean ziper;

    public Estojo(String material, String formato){
        this.material = material;
        this.formato = formato;
        this.volumeAtual = 0.0;
        this.ziper = false;
    }

    public String getMaterial() {
        return this.material;
    }

    public String getFormato() {
        return this.formato;
    }

    public double getVolumeAtual(){
        return this.volumeAtual;
    }

    public boolean isZiper() {
        return this.ziper;
    }


    public void abrir(){
        if (ziper){
            System.out.println("Seu estojo ja esta aberto!!");
            return;
        }
        this.ziper = true;
        System.out.println("abrindo estojo, zooooooop!");
    }
    public void fechar(){
        if (!ziper){
            System.out.println("Seu estojo ja esta fechado!");
            return;
        }
        this.ziper = false;
        System.out.println("Fechando estojo!! Zuuuuuump!");
    }

    public void colocarMaterial(double volumeDeMaterial){
        if (!ziper){
            System.out.println("abra primeiro o ziper");
            return;
        }
        if (volumeDeMaterial < 0.0){
            System.out.println("ERRO!, valor indisponivel");
            return;
        } else if (volumeDeMaterial + volumeAtual > CAPACIDADE_MAXIMA) {
            System.out.println("Erro! capacidade maxima é de 400ml");
            return;
        }
        this.volumeAtual += volumeDeMaterial;
        System.out.println("material adicionado agora temos: "+ volumeAtual);
    }
    public void tirarMaterial(double volumeDeMaterial){
        if (!ziper || volumeAtual == 0){
            System.out.println("não tem nada aqui! ou esta fechado");
            return;
        } else if (volumeDeMaterial > volumeAtual) {
            System.out.println("não é possivel tirar mais material do que esta armazenado:"+ volumeAtual);
            return;
        }
        this.volumeAtual -= volumeDeMaterial;
        System.out.println("volume de material retirado temos agora: "+ volumeAtual);
    }


}
