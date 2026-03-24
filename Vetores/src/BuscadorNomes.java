import java.util.Scanner;

public class BuscadorNomes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[10];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Cadastre o nome " + i + ": ");
            nomes[i] = entrada.next();
        }

        System.out.print("\nQual nome deseja buscar? ");
        String busca = entrada.next();
        boolean encontrado = false;

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(busca)) {
                System.out.println("Nome encontrado na posição: " + i);
                encontrado = true;
                break; // Otimização: se achou, não precisa continuar o laço
            }
        }

        if (!encontrado) {
            System.out.println("Nome não cadastrado na lista.");
        }
    }
}
