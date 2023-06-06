package Arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[3];
        String a = Arrays.toString(notasAlunoA);
        System.out.println(a);

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 6.5;
        notasAlunoA[2] = 8;

        a = Arrays.toString(notasAlunoA);
        System.out.println(a);

        double totalAlunoA = 0;
        for (int i = 0; i < notasAlunoA.length; i++){
            totalAlunoA += notasAlunoA[i];
        }
        double mediaA = totalAlunoA/ notasAlunoA.length;
        System.out.printf("media aluno A: %.2f \n", mediaA);

        double[] notasAlunoB = { 6.9,7.3, 2.2 };
        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++){
            totalAlunoB += notasAlunoB[i];
        }
        double mediaB = totalAlunoB/ notasAlunoB.length;
        System.out.printf("media aluno B: %.2f", mediaB);
    }
}
