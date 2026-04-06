public class DiagonalPrincipal {
    public static void main(String[] args){
        // declaração
        int[][] matriz = new int[4][4];
        // alimenta a matriz
        // calcula a soma dos elementos da DP
        int soma = 0;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                // 0.33 => 3 + 10 => 13
                // 0.00 => 0 + 10 => 10
                // 0.99 => 9 + 10 => 19
                matriz[i][j] = (int) (Math.random() * 10) + 10;
                if (i == j){
                    System.out.println("Elemento faz parte da DP " +
                            matriz[i][j]);
                    soma += matriz[i][j];
                }
            }
        }
        System.out.println("Soma dos elemento da DP " + soma);
    }

}
