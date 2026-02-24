import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        // solicita entrada de dados
        Scanner entrada = new Scanner(System.in);
        // variável do tipo String
        System.out.println("Informe seu nome");
        String nome = entrada.next();
        // variável do tipo int
        System.out.println("Informe a idade");
        int idade = entrada.nextInt();
        // variável do tipo float
        System.out.println("Informe o peso");
        float peso = entrada.nextFloat();
        System.out.println("Informe a altura");
        float altura = entrada.nextFloat();
        // calcula o IMC
        float imc = peso / (altura * altura);
        System.out.println( nome + " seu IMC é " + imc);
        String mensagem = "";
        // operador lógico E em java é representado por &&
        if (imc >= 0 && imc < 18.5f) {
           mensagem = "Abaixo do peso";
        }
        else if (imc >= 18.5f && imc <= 24.9f){
            mensagem = "Peso normal";
        }
        else if (imc >= 25 && imc <= 29.9f){
            mensagem = "Sobrepeso";
        }
        else if (imc >= 30 && imc <= 34.9f){
            mensagem = "Obesidade grau I";
        }
        else if (imc >= 35 && imc <= 39.9f){
            mensagem = "Obesidade grau II";
        }
        else if (imc >= 40){
            mensagem = "Obesidade grau III";
        }
        else
            mensagem = "Valores inválidos";

        System.out.println(nome + " sua classificação é " + mensagem);
    }
}