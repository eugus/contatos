package Poo.Aula12;

public class Ave extends Animal {
    private String corPena;


    @Override
    public void locomover() {
        System.out.println("voando");
    }

    @Override
    public void seAlimentar() {
        System.out.println("bicando");
    }

    @Override
    public void emitirSom() {
        System.out.println("AAAAAAAAAA");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
