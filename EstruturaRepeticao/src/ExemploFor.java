import java.util.Scanner;

public class ExemploFor {
    public static void main(String[] args){
        // pede ao usuário para informar qtde de vezes o dado será lançado
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe qtde de vezes o dado será lançado");
        int qtde = entrada.nextInt();
        // pede ao usuário qual número ele deve acertar
        System.out.println("Informe o número que deve acertar");
        int numero = entrada.nextInt();
        while (numero < 1 || numero > 6){
            System.out.println("Número deve ser entre 1 e 6");
            numero = entrada.nextInt();
        }
        int conta = 0; // conta quantas vezes acertou
        for(int i=1; i <= qtde; i++){
            int aleatorio = (int) (Math.random() * 6 + 1);
            System.out.println("Dado lançado " + aleatorio);
            if (aleatorio == numero){
                conta++;
            }
        }
        System.out.println("Quantidade de acertos " + conta);
        // converte a variável conta em float
        System.out.println("% de acerto " + ( (float) conta / qtde) * 100);
    }
}
