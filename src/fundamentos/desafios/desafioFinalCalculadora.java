package fundamentos.desafios;

import java.util.Scanner;

public class desafioFinalCalculadora {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Número 1: ");
        double num1 = entrada.nextDouble();

        System.out.print("Número 2: ");
        double num2 = entrada.nextDouble();

        System.out.println("Operadores: (+) (-) (*) (/) (%) ");
        System.out.print("Escolha o operador: ");
        String operador = entrada.next();

        double resultado = ("+").equals(operador) ? num1 + num2 : 0;
        resultado = ("-").equals(operador) ? num1 - num2 : resultado;
        resultado = ("*").equals(operador) ? num1 * num2 : resultado;
        resultado = ("/").equals(operador) ? num1 / num2 : resultado;
        resultado = ("%").equals(operador) ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", num1, operador, num2, resultado);

        entrada.close();

    }

}
