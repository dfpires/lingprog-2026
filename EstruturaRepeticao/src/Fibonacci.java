import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos termos da sequência de Fibonacci você deseja ver? ");
        long termos = entrada.nextInt();

        long anterior = 0;
        long atual = 1;

        System.out.println("\nSequência de Fibonacci com " + termos + " termos:");

        // O laço FOR é ideal aqui pois sabemos a quantidade exata de repetições
        for (int i = 1; i <= termos; i++) {
            // Imprime o número atual da sequência
            System.out.print(anterior + " ");

            // Cálculo do próximo termo
            long proximo = anterior + atual;

            // A "Dança das Cadeiras":
            // O anterior vira o atual, e o atual vira a soma (proximo)
            anterior = atual;
            atual = proximo;
        }

        System.out.println("\n\nFim da sequência.");
    }
}
