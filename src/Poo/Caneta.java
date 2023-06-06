package Poo;

public class Caneta {
    public String modelo;
    public String cor;
    private double ponta;
    protected int carga;
    private boolean tampada;

    public Caneta(){
        this.modelo = "Bic";
        this.cor = "Azul";
        this.ponta = 0.7;
        this.carga = 100;
        this.tampar();
    }

    public Caneta(String m, String c, double p, int k){
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.carga = k;
        this.tampar();
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getPonta(){
        return ponta;
    }
    public void setPonta(double ponta){
        this.ponta = ponta;
    }

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("cor: " + this.cor);
        System.out.println("ponta: " + this.ponta);
        System.out.println("carga: " +  this.carga);
        System.out.println("esta tampada? " + this.tampada);
    }
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("nao posso escrever com a caneta tampada bocó");
        }else {
            System.out.println("i e caneta azul i azul caneeta");
        }
    }
    protected void tampar(){
        this.tampada = true;
    }

    protected void destampar(){
        this.tampada = false;
    }

}


