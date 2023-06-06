package Poo.Aula12;

public class Mamifero extends Animal{
    private String corPelo;
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void seAlimentar() {
        System.out.println("mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de mamada");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
