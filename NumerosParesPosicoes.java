import java.util.Scanner;

public class NumerosParesPosicoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // cria um vetor para armazenar os números reais
        double[] numeros = new double[10];

        // lê 10 números reais e armazena no vetor
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número #" + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        // imprime os elementos nas posições pares do vetor
        System.out.print("Elementos nas posições pares: ");
        for (int i = 0; i < 10; i += 2) {
            System.out.print(numeros[i] + " ");
        }

        scanner.close();
    }
}