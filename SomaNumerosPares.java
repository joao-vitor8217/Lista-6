import java.util.Scanner;

public class SomaNumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // cria um vetor para armazenar os números
        int[] numeros = new int[10];

        // le 10 números inteiros e armazena no vetor
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número #" + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
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

        // calcula a soma dos números pares
        int somaPares = 0;
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];
            }
        }

        // imprime a soma dos números pares
        System.out.println("Soma dos números pares: " + somaPares);

        scanner.close();
    }
}