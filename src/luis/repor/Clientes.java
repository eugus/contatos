package luis.repor;

public class Clientes {
    public String nome;
    public String senha;

    public Clientes(String nome, String senha){
        this.nome = nome;
        this.senha = senha;




        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
