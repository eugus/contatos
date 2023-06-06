package Poo.Aula12;

public class reptil extends Animal{
    private String corEscama;
    @Override
    public void locomover() {
        System.out.println("rastejando");
    }

    @Override
    public void seAlimentar() {
        System.out.println("comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de reptil");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
