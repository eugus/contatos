package Poo;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    //Metodos especiais

    public ContaBanco(){
        saldo = 0;
        status = false;
    }
   /* public int setNumConta(int n){
        numConta = n;
    }*/

    public void setNumConta(int n) {
        numConta = n;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setTipo(String T){
        tipo = T;
    }
    public String getTipo(){
        return tipo;
    }
    public void setDono(String D){
        dono = D;
    }
    public String getDono(){
        return dono;
    }
    public void setSaldo(double s){
        saldo = s; 
    }
    public double getSaldo(){
        return saldo;
    }
    public void setStatus(boolean S){
        status = S;
    }
    public boolean getStatus(){
        return status;
    }
    //metodos normais

    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        if (t == "CC") {
            saldo = 50;
        } else if (t == "CP") {
            saldo = 150;
        }
    }
    public void FecharContar(){
        if (saldo > 0 ){
            System.out.println("Conta com dinheiro");
        } else if (saldo < 0) {
            System.out.println("conta em debito");
        }else {
            setStatus(false);
        }
    }
    public void depositar(double v){
        if (status == true){
            setSaldo(getSaldo() + v);
            //saldo = saldo + v;
        }else {
            System.out.println("Impossivel depositar");
        }
    }
    public void sacar(double v){
        if (status == true){
            if (saldo > 0){
                setSaldo(getSaldo() - v);
            }else {
                System.out.println("saldo insuficiente");
            }
        }
    }
    public void pagarMensal(){
        double v = 0;
        if (tipo == "CC"){
            v = 12;
        } else if (tipo == "CP") {
            v = 20;
        }
        if (status == true){
            if (saldo > v){
                setSaldo(getSaldo() - v);
            }else {
                System.out.println("Saldo Insuficiente");
            }
        }else {
            System.out.println("impossivel pagar");
        }
    }
}
