package fundamentos.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class calculadoraPotenciacao {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        // Título
        System.out.println("=".repeat(30));
        System.out.println("CALCULADORA DE POTENCIAÇÃO");
        System.out.println("=".repeat(30));

        // Recebendo valores do usuário
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite o valor: ");
        double numero = entrada.nextDouble();

        // Realizando cálculos
        double numeroAoQuadrado = Math.pow(numero, 2);
        double numeroAoCubo = Math.pow(numero, 3);

        // Mostrando valores na tela
        System.out.println("=".repeat(30));

        System.out.printf("%.2f ao Quadrado = %.2f", numero, numeroAoQuadrado);
        System.out.printf("\n%.2f ao Cubo = %.3f\n", numero, numeroAoCubo);

        System.out.println("=".repeat(30));

        entrada.close();
    }

}
