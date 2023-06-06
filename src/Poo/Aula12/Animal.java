package Poo.Aula12;

public abstract class Animal {
    protected double peso;
    protected int idade;
    protected int membro;

    public abstract void locomover();
    public abstract void seAlimentar();
    public abstract void emitirSom();

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembro() {
        return membro;
    }

    public void setMembro(int membro) {
        this.membro = membro;
    }
}
