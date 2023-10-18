import java.util.Scanner;

public class NumerosNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // cria um vetor para armazenar os números reais
        double[] numeros = new double[10];

        // lê 10 números reais e armazena no vetor
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número #" + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        // imprime o vetor
        System.out.print("Vetor: [");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i]);
            if (i < 9) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // mostra as posições do vetor com números negativos
        System.out.print("Posições com números negativos: ");
        for (int i = 0; i < 10; i++) {
            if (numeros[i] < 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        scanner.close();
    }
}