import java.util.Scanner;

public class ExemploDoWhile {
    public static void main(String[] args){
        float saldo = 0;
        int opcao = 0;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Digite uma das opções: \n 1. Consultar saldo \n 2. Depositar \n 3. Sacar \n 4. Sair");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual da conta " + saldo);
                    break;
                case 2:
                    System.out.println("Informe valor do depósito");
                    float valor = entrada.nextFloat();
                    saldo += valor;
                    System.out.println("Depósito realizado com sucesso");
                    break;
                case 3:
                    System.out.println("Informe valor do saque");
                    valor = entrada.nextFloat();
                    if (valor <= saldo) {
                        saldo -= valor;
                        System.out.println("Saque realizado com sucesso");
                    } else System.out.println("Saldo insuficiente");
                    break;
                case 4:
                    System.out.println("Programa será encerrado");
                    break;
                default:
                    System.out.println("Opção inválida");
            } // fecha switch
        } // fecha do
        while (opcao != 4);
    }
}
