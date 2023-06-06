package Poo.Heranca1;

public class Professor extends Pessoa {
    private String especialidade;
    private double salario;
    //metodos
    public void receberAum(double Aum){
        this.salario = Aum;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
