
public class Notas {
    public static void main(String[] args){

        // declaração da matriz
        float[][] notas = new float[3][4];

        // leitura da matriz
        // soma as notas
        float soma = 0;
        for(int i=0;i<notas.length;i++){
            for(int j=0;j<notas[i].length; j++){
                // gera notas entre 0 e 10
                notas[i][j] = (float) (Math.random() * 10);
                soma += notas[i][j];
                System.out.printf("%.2f   ", notas[i][j]);
            }
            System.out.println("");
        }
        int qtdeNotas = notas.length * notas[0].length;
        System.out.printf("\n A média das notas é %.2f" , soma / qtdeNotas);
    }
}