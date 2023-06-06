package Desa2;

public class ContatoDois {
    public String nome;
    public int contPess;


    //public  int contProf;
    public void editar() {
        System.out.println("Editando");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getContPess() {
        return contPess;
    }

    public void setContPess(int contPess) {
        this.contPess = contPess;
    }
    public ContatoDois(String nome, int contPess) {
        this.nome = nome;
        this.contPess = contPess;

    }
    public String ligar(String contlig) {
        return "Chamando para, " + contlig;
    }
    public String favoritar(String confav) {

        return confav + ", adicionado aos favoritos *";
    }
    @Override
    public String toString() {
        return nome;
    }
}

