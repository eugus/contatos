package Poo.Aula12;

public class Peixe extends Animal{
    private String corEscama;
    @Override
    public void locomover() {
        System.out.println("nadando");
    }

    @Override
    public void seAlimentar() {
        System.out.println("blame blame");
    }

    @Override
    public void emitirSom() {
        System.out.println("peixe nao faz som eu acho");
    }
    public void soltarBolha(){
        System.out.println("bloob bloob");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
