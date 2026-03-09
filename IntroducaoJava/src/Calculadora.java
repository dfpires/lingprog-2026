import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um número");
        float n1 = entrada.nextFloat();
        System.out.println("Informe outro número");
        float n2 = entrada.nextFloat();
        System.out.println("Informe o operador +, -, * ou /");
        String operador = entrada.next();
        float resultado = 0;
        switch(operador) {
            case "+": resultado = n1 + n2; break;
            case "-": resultado = n1 - n2; break;
            case "*": resultado = n1 * n2; break;
            case "/": resultado = n1 / n2; break;
            default: System.out.println("Operador inválido"); return;
        }
        System.out.println("Resultado: " + resultado);
    }
}
