package Poo.Heranca1;

public class Aluno extends Pessoa{
    private int matr;
    private String curso;

    //metodos
    public void cancelarMatr(){
        System.out.println("Matricula cancelada");
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
