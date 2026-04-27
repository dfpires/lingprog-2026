import java.util.Scanner;

public class FilaAtendimento {

    public static void main(String[] args) {
        int[] guiche1 = new int[5];
        int[] guiche2 = new int[5];
        // Chamada da primeira funç
        // ão para ler as senhas
        lerSenhas(guiche1);
        lerSenhas(guiche2);

        // Chamada da segunda função para intercalar e exibir
        int[] filaFinal = intercalarFilas(guiche1, guiche2);

        exibirFila(filaFinal);
    }

    public static void lerSenhas(int [] vetor) {
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite a " + (i + 1) + "ª senha: ");
            vetor[i] = entrada.nextInt();
        }
    }

    /**
     * Função que une dois vetores intercalando seus elementos.
     * Exemplo: G1[0], G2[0], G1[1], G2[1]...
     * @param v1 Vetor do primeiro guichê.
     * @param v2 Vetor do segundo guichê.
     * @return Terceiro vetor com a fila intercalada.
     */
    public static int[] intercalarFilas(int[] v1, int[] v2) {
        int[] resultado = new int[10]; // 5 de cada guichê = 10 total
        int j = 0; // Índice auxiliar para os vetores originais

        for (int i = 0; i < 5; i++) {
            resultado[j++] = v1[i]; // Coloca o do primeiro guichê e incrementa j
            resultado[j++] = v2[i]; // Coloca o do segundo guichê e incrementa j
        }
        return resultado;
    }

    /**
     * Função simples para exibir o vetor final.
     */
    public static void exibirFila(int[] fila) {
        System.out.println("\n--- FILA FINAL INTERCALADA ---");
        for (int senha : fila) {
            System.out.print(senha + " | ");
        }
        System.out.println("FIM");
    }
}