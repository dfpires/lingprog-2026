import java.util.Scanner;

public class ExemploSwitch2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite A. Cadastra B. Consulta C. Sair");
        String opcao = entrada.next();
        switch(opcao){
            case "A":
                System.out.println("Cadastro realizado com sucesso");
                break;
            case "B":
                System.out.println("Consulta realizada com sucesso");
                break;
            case "C":
                System.out.println("Programa será encerrado");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

}
