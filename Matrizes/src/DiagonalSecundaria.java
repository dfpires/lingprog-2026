import java.util.Scanner;

public class DiagonalSecundaria {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe tamanho da matriz");
        int n = entrada.nextInt();
        // declaração
        int[][] matriz = new int[n][n]; // matriz quadrada
        // alimenta a matriz
        // calcula a soma dos elementos da DP
        int soma = 0;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j] = (int) (Math.random() * 10) + 10;
                if ((i + j) == matriz.length - 1){ // é DS
                    System.out.println("Elemento faz parte da DS " +
                            matriz[i][j]);
                    soma += matriz[i][j];
                }
            }
        }
        System.out.println("Soma dos elemento da DS " + soma);
    }

}
