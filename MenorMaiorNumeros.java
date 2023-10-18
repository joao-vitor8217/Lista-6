import java.util.Scanner;

public class MenorMaiorNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // cria um vetor para armazenar os números reais
        double[] numeros = new double[10];

        // lê 10 números reais e armazena no vetor
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número #" + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        // encontra o menor e o maior número no vetor
        double menor = numeros[0];
        double maior = numeros[0];

        for (int i = 1; i < 10; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
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

        // imprime o menor e o maior número
        System.out.println("Menor número: " + menor);
        System.out.println("Maior número: " + maior);

        scanner.close();
    }
}