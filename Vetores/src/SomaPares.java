import java.util.Scanner;

public class SomaPares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[8];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = entrada.nextInt();

            // Verifica se o número guardado na gaveta 'i' é par
            if (numeros[i] % 2 == 0) {
                soma += numeros[i];
            }
        }

        System.out.println("\nA soma de todos os números pares digitados é: " + soma);
    }
}