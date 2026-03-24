import java.util.Scanner;

public class SubstituicaoValores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];

        // Primeiro laço: Leitura e Substituição
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o valor para a posição [" + i + "]: ");
            numeros[i] = entrada.nextInt();

            // Se for negativo, substitui na hora
            if (numeros[i] < 0) {
                numeros[i] = 0;
            }
        }

        // Segundo laço: Exibição do vetor já "limpo"
        System.out.println("\nVetor resultante (sem negativos):");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}