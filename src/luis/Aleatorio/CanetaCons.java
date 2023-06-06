package luis.Aleatorio;

public class CanetaCons {

    /*public CanetaCons(String modelo, String cor, float ponta, boolean tampada){
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.tampada = tampada;
    }
    */


    public CanetaCons(String modelo, String cor, float ponta, boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.tampada = tampada;
    }

    public String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public String tampar(){
        return "tampada";
    }
    public String destampada(){
        return "destampada";
    }

   /* public void status(){
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: "+ this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Tampada? " + this.isTampada());
    }

    */
}


