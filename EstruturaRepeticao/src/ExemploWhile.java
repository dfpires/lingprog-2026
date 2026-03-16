import java.util.Scanner;

public class ExemploWhile {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        /*int condicao = 1;
        while (condicao <= 10){
            System.out.println("Oi exibido quando condicao = " + condicao);
            System.out.println((int) (Math.random()*10) );
            condicao++;
        }


        int condicao = 1;
        float nota = 0;
        float soma = 0;
        while (condicao <= 10){
            System.out.println("Informe uma nota");
            nota = entrada.nextInt();
            if (nota < 0 || nota > 10){ // || é o OR
                break; // força a saída do while
            }
            soma += nota;
            condicao++;
        } // fecha o while
        if (condicao == 11){ // foi normal, sem entrar no break
            float media = soma / 10;
            System.out.println("A média é " + media);
        }
        else {
            System.out.println("Nota inválida ");
        } */

        int condicao = 1;
        float nota = 0;
        float soma = 0;
        while (condicao <= 5){
            System.out.println("Informe uma nota");
            nota = entrada.nextInt();
            if (nota < 0 || nota > 10){
                System.out.println("Nota inválida, tente novamente");
                continue; // não sai do loop, ignora o que tem embaixo
            }
            condicao++;
            soma += nota;
        }
        float media = soma / 5;
        System.out.println("Média é " + media);
    }
}
