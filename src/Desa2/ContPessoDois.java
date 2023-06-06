package Desa2;

public class ContPessoDois extends ContatoDois {

    public ContPessoDois( String nome, int contPess) {
        super(nome, contPess);


    }
    public void adicionar(){

        super.contPess = contPess ;
    }

    @Override
    public String favoritar(String confav) {

        return super.favoritar(confav);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
