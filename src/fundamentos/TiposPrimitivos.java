package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //Informações do funcionário

        //Tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numerosDeVoos = 542;
        int id = 56789;
        long pontosAcumlados = 3_234_567_890L;

        //tipos numericos reais
        float salario = 11_445.44F;
        double vendasAcumladas = 2_991_197_103.01;

        //tipo booleano
        boolean estaDeFerias = false; //true

        //tipo caractere
        char status = 'A'; //ativo

        //dias de empresa
        System.out.println(anosDeEmpresa * 365);
        //numeros de viagens
        System.out.println(numerosDeVoos/2);
        //pontos por real
        System.out.println(pontosAcumlados/vendasAcumladas);
        System.out.println(id + ": ganha ->" + salario);
        System.out.println("ferias?" + estaDeFerias);
        System.out.println("Status: " + status);
    }
}
