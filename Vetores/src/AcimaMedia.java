import java.util.Scanner;

public class AcimaMedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] salarios = new double[5];
        double soma = 0;

        // 1ª Passagem: Leitura e Acumulação da Soma
        for (int i = 0; i < salarios.length; i++) {
            System.out.print("Informe o salário do " + (i + 1) + "º funcionário: R$ ");
            salarios[i] = entrada.nextDouble();
            soma += salarios[i];
        }

        // Cálculo da média após ter todos os valores
        double media = soma / salarios.length;

        int acima = 0, abaixo = 0, exatamenteIgual = 0;

        // 2ª Passagem: Comparação de cada posição com a média calculada
        for (int i = 0; i < salarios.length; i++) {
            if (salarios[i] > media) {
                acima++;
            } else if (salarios[i] < media) {
                abaixo++;
            } else {
                exatamenteIgual++;
            }
        }

        // Exibição dos resultados
        System.out.println("\n--- RELATÓRIO ESTATÍSTICO ---");
        System.out.printf("Média Salarial da Empresa: R$ %.2f%n", media);
        System.out.println("Funcionários acima da média: " + acima);
        System.out.println("Funcionários abaixo da média: " + abaixo);
        System.out.println("Funcionários que ganham exatamente a média: " + exatamenteIgual);
    }
}