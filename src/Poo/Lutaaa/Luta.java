package Poo.Lutaaa;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int round;
    private boolean aprovado;

    //metodos especiais
    public void macarLuta(Lutador l1,Lutador l2){
        if ((l1.getCategoria() == l2.getCategoria()) && l1 != l2){
            aprovado = true;
            desafiado=l1;
            desafiante = l2;
        }else {
            aprovado = false;
            desafiado= null;
            desafiante=null;
        }
    }
    public void lutar(){
        if (aprovado){
        }
    }
}
