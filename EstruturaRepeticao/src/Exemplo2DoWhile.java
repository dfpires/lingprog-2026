import java.util.Scanner;

public class Exemplo2DoWhile {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe nome do cliente");
        String nome = entrada.next();
        System.out.println("Informe valor da compra");
        float valor = entrada.nextFloat();
        int opcao = 0;
        do {
            System.out.println("Digite 1. À vista 2. À prazo sem juros 3. À prazo com juros");
            opcao = entrada.nextInt();
            switch(opcao) {
                case 1:
                    System.out.println("15% de desconto " + (valor - valor * 0.15f));
                    break;
                case 2:
                    System.out.println("Qtde de parcelas ( até 5x )");
                    int qtde = entrada.nextInt();
                    for (int i = 1; i <= qtde; i++) {
                        System.out.println(" Valor da " + i + "a. parcela: " + valor / qtde);
                    }
                    break;
                case 3:
                    System.out.println("2% ao mês de juros, 10 parcelas de " + (valor * 1.20) / 10);
                    break;
                case 4:
                    System.out.println("Programa vai ser encerrado");
                default:
                    System.out.println("Opção inválida");
            }
        }
        while (opcao != 4);
    }
}
