import java.util.Scanner;

public class OficinaTecnologia {

    public static void main(String[] args) {
        int[] oficina1 = new int[10];
        int[] oficina2 = new int[10];

        // 1. Chamada da função para leitura
        System.out.println("--- Cadastro Oficina 1 ---");
        lerCodigos(oficina1);

        System.out.println("\n--- Cadastro Oficina 2 ---");
        lerCodigos(oficina2);

        // 2. Chamada da função para encontrar comuns
        int[] comuns = encontrarComuns(oficina1, oficina2);

        // 3. Exibição do resultado
        exibirComuns(comuns);
    }

    // Função para ler os códigos de inscrição
    public static void lerCodigos(int[] vetor) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Código do " + (i + 1) + "º participante: ");
            vetor[i] = entrada.nextInt();
        }
    }

    // Função para montar o vetor de interseção sem repetições
    public static int[] encontrarComuns(int[] v1, int[] v2) {
        int[] resultadoProvisorio = new int[10];
        int totalComuns = 0;

        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v2.length; j++) {
                // Se o código existe em ambos os vetores
                if (v1[i] == v2[j]) {

                    // Verifica se já não adicionamos esse código antes (evitar duplicatas)
                    boolean jaExiste = false;
                    for (int k = 0; k < totalComuns; k++) {
                        if (resultadoProvisorio[k] == v1[i]) {
                            jaExiste = true;
                            break;
                        }
                    }

                    if (!jaExiste) {
                        resultadoProvisorio[totalComuns] = v1[i];
                        totalComuns++;
                    }
                }
            }
        }

        // Criamos um vetor do tamanho exato dos encontrados para não exibir zeros vazios
        int[] resultadoFinal = new int[totalComuns];
        for (int i = 0; i < totalComuns; i++) {
            resultadoFinal[i] = resultadoProvisorio[i];
        }

        return resultadoFinal;
    }

    public static void exibirComuns(int[] vetor) {
        if (vetor.length == 0) {
            System.out.println("\nNão há participantes em comum entre as oficinas.");
        } else {
            System.out.println("\n--- Participantes em Ambas as Oficinas ---");
            for (int codigo : vetor) {
                System.out.print(codigo + " ");
            }
            System.out.println();
        }
    }
}