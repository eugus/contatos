package luis.Desaf;

public  class  Contato {

    public String nome;
    public int contPess;
    public  int contProf;


    public void editar(){
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

    public int getContProf() {
        return contProf;
    }

    public void setContProf(int contProf) {
        this.contProf = contProf;
    }
/* public Contato(String nome, int contPess, int contProf) {
        this.nome = nome;
        this.contPess = contPess;
        this.contProf = contProf;
    }

    */
}
