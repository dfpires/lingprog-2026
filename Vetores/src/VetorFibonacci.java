import java.util.Scanner;

public class VetorFibonacci {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos termos da sequência de Fibonacci você deseja guardar? ");
        int n = entrada.nextInt();

        // 1. Criando o vetor com o tamanho que o usuário escolheu
        int[] fibo = new int[n];

        // 2. Casos base: Os dois primeiros números são sempre 0 e 1
        // Precisamos tratar o caso de n ser 1 ou maior que 1
        if (n >= 1) {
            fibo[0] = 0;
        }
        if (n >= 2) {
            fibo[1] = 1;
        }

        // 3. Preenchendo o restante do vetor (começando do índice 2)
        // Cada posição é a soma das duas anteriores
        for (int i = 2; i < n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        // 4. Exibindo o vetor completo
        System.out.println("\n--- VETOR DE FIBONACCI GERADO ---");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + fibo[i] + "] ");
        }
    }
}
