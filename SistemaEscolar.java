import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[8];

        // Entrada das 8 notas
        System.out.println("Digite as 8 notas do aluno:");
        for (int i = 0; i < 8; i++) {
            System.out.print((i + 1) + "º Bimestre: ");
            notas[i] = scanner.nextDouble();
        }

        // Cálculo das médias
        double primeiroSemestre = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
        double segundoSemestre = (notas[4] + notas[5] + notas[6] + notas[7]) / 4;
        double mediaFinal = (primeiroSemestre + segundoSemestre) / 2;

        // Saída formatada
        System.out.println("\nResultados:");
        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "º Bimestre: " + notas[i]);
        }
        System.out.println("-------------");
        System.out.printf("1º Semestre: %.1f\n\n", primeiroSemestre);

        for (int i = 4; i < 8; i++) {
            System.out.println((i + 1) + "º Bimestre: " + notas[i]);
        }
        System.out.println("-------------");
        System.out.printf("2º Semestre: %.1f\n", segundoSemestre);
        System.out.println("-------------");
        System.out.printf("Média Final: %.1f\n", mediaFinal);

        scanner.close();
    }
}
