import java.util.Scanner;

public class UniaoVetores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] v1 = new int[5];
        int[] v2 = new int[5];
        int[] vUniao = new int[10];

        System.out.println("Preencha o Vetor 1:");
        for (int i = 0; i < v1.length; i++) {
            v1[i] = entrada.nextInt();
            vUniao[i] = v1[i]; // Copia para as primeiras 5 posições
        }

        System.out.println("Preencha o Vetor 2:");
        for (int i = 0; i < v2.length; i++) {
            v2[i] = entrada.nextInt();
            // Copia para as posições de 5 a 9 (i + 5)
            vUniao[i + 5] = v2[i];
        }

        System.out.print("\nVetor União: ");
        for (int num : vUniao) {
            System.out.print(num + " ");
        }
    }
}
