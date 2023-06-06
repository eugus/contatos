package luis.Aleatorio;

public class PencilExec {
    public static void main(String[] args) {

        Pencil c1 = new Pencil();
        c1.cor = "preta";
        c1.carga = 40;
        c1.modelo = "bic";
        //c1.ponta = 0.5;
        c1.tampada = false;

        c1.status();
        c1.rabiscar();
    }
}
