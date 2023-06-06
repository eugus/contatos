package luis.Aleatorio;

public class Pencil {
   public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected  boolean tampada;

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("Posso rabiscar");
        }else
            System.out.println("ERRO");
    }





}
