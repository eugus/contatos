package luis.Aula0555;

public class ContaBanco {

    //Atributos
    public int numConta;
    protected  String tipo;
    private String dono;
    private  float saldo;
    private boolean status;

    //Métodos Personalizados
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC"){
            this.setSaldo(50);
        }else if(t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada ");
        }else if (this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechada");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada");
        }

    }
    public void depositar(float v){
        if (this.isStatus()){
            this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesso");
        }else{
            System.out.println("Impossivel depositar");
        }

    }
    public void sacar(){

    }
    public void pagarMensal(){

    }

    //Métodos Espciais
    public ContaBanco(){

    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    /*public int getNumConta(){
        return this.numConta;

    }

    public void setNumConta(int nc){
        this.numConta = nc;
    }

    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tp){
        this.tipo = tipo;
    }
    public String getDono(){
        return this.dono;
    }

    public void setDono(String dn){
        this.dono = dono;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public void setSaldo(float sld){
        this.saldo = saldo;
    }

    public boolean getABoolean(){
        return this.status;
    }

    public void setStatus(boolean stts){
        this.status = stts;
    }

     */

}
