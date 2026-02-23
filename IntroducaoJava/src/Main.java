public class Main {
    public static void main(String args[]){
        // variável do tipo String
        String nome = "Daniel";
        // variável do tipo int
        int idade = 51;
        // variável do tipo float
        float peso = 92.5f;
        float altura = 1.78f;
        // calcula o IMC
        float imc = peso / (altura * altura);
        System.out.println( nome + " seu IMC é " + imc);
    }
}