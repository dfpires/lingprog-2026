import java.util.Scanner;

public class CalculaMedia {
    public static void main(String[] args){
        float soma = 0;
        // cria vetor
        float[] notas = new float[5];
        Scanner entrada = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Informe a nota " + (i+1));
            // armazena o valor na posição i do vetor
            notas[i] = entrada.nextFloat();
            // soma a nota
            soma += notas[i];
        }
        System.out.println("A média é " + soma/5);
    }
}