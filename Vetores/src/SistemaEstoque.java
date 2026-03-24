import java.util.Scanner;

public class SistemaEstoque {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // 1. Declaração de vetores paralelos
        String[] nomes = new String[5];
        int[] quantidades = new int[5];

        System.out.println("--- CADASTRO DE PRODUTOS ---");

        // 2. Preenchimento dos dados
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("\nNome do produto " + (i + 1) + ": ");
            nomes[i] = entrada.next();

            System.out.print("Quantidade em estoque de " + nomes[i] + ": ");
            quantidades[i] = entrada.nextInt();
        }

        // 3. Processamento e Filtro (Estoque Crítico)
        System.out.println("\n----------------------------------");
        System.out.println("ALERTA: PRODUTOS COM ESTOQUE CRÍTICO");
        System.out.println("(Menos de 5 unidades)");
        System.out.println("----------------------------------");

        boolean temCritico = false;

        for (int i = 0; i < quantidades.length; i++) {
            // Verificamos a quantidade, mas usamos o nome correspondente
            if (quantidades[i] < 5) {
                System.out.println("-> " + nomes[i] + ": apenas " + quantidades[i] + " unidades.");
                temCritico = true;
            }
        }

        if (!temCritico) {
            System.out.println("Tudo em ordem! Nenhum item abaixo do limite.");
        }
    }
}
