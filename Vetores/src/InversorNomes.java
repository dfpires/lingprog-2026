import java.util.Scanner;

public class InversorNomes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[5];

        // Preenchendo o vetor
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = entrada.next();
        }

        System.out.println("\nNomes na ordem inversa:");
        // O laço começa em 4 (nomes.length - 1) e vai até 0
        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.println(nomes[i]);
        }
    }
}