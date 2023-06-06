package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("quantos alunos: ");
        int qtdDeAlunos = entrada.nextInt();

        System.out.println("quantos notas: ");
        int qtdDeNotas = entrada.nextInt();

        double [][] notasDaTurma = new double[qtdDeAlunos][qtdDeNotas];

        double total = 0;
        for (int a = 0; a < notasDaTurma.length; a++){
            for (int n = 0; n < notasDaTurma[a].length;n++){
                System.out.printf("informe a %d do aluno %d: ", (n + 1), (a+ 1));
                notasDaTurma[a][n]= entrada.nextDouble();
                total += notasDaTurma[a][n];
            }
        }
        System.out.println(total);
        double media = total/(qtdDeNotas * qtdDeAlunos);
        System.out.println("a media da turma é " + media);
        for (double [] notasDoAluno: notasDaTurma){
            System.out.println(Arrays.toString(notasDoAluno));
        }



        entrada.close();
    }
}
