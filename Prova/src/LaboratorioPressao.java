import java.util.Scanner;

public class LaboratorioPressao {

    public static void main(String[] args) {
        String[] nomes = new String[10];
        double[][] pressoes = new double[10][7];

        // 1. Chamada da função para leitura
        lerDados(nomes, pressoes);

        // 2. Chamada da função para identificar o paciente com maior média
        exibirMaiorMediaPaciente(nomes, pressoes);

        // 3. Chamada da função para média diária
        exibirMediasPorDia(pressoes);
    }

    // Função para ler nomes e preencher a matriz de pressões
    public static void lerDados(String[] nomes, double[][] matriz) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("\nNome do paciente " + (i + 1) + ": ");
            nomes[i] = entrada.nextLine();

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Pressão no dia " + (j + 1) + ": ");
                matriz[i][j] = entrada.nextDouble();
            }
            entrada.nextLine(); // Limpar o buffer do teclado
        }
    }

    // Função para identificar o paciente com a maior média de pressão (Processamento por LINHA)
    public static void exibirMaiorMediaPaciente(String[] nomes, double[][] matriz) {
        double maiorMedia = -1;
        String nomeVencedor = "";

        for (int i = 0; i < matriz.length; i++) {
            double somaPaciente = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                somaPaciente += matriz[i][j];
            }
            double mediaAtual = somaPaciente / matriz[i].length;

            if (mediaAtual > maiorMedia) {
                maiorMedia = mediaAtual;
                nomeVencedor = nomes[i];
            }
        }
        System.out.printf("\nPaciente com a maior média: %s (Média: %.2f mmHg)\n", nomeVencedor, maiorMedia);
    }

    // Função para calcular a média por dia (Processamento por COLUNA)
    public static void exibirMediasPorDia(double[][] matriz) {
        System.out.println("\n--- MÉDIAS DIÁRIAS (Todos os Pacientes) ---");

        // Note que aqui invertemos os laços: o externo percorre os DIAS (colunas)
        for (int j = 0; j < 7; j++) {
            double somaDia = 0;
            for (int i = 0; i < 10; i++) {
                somaDia += matriz[i][j];
            }
            double mediaDia = somaDia / 10;
            System.out.printf("Dia %d: %.2f mmHg\n", (j + 1), mediaDia);
        }
    }
}