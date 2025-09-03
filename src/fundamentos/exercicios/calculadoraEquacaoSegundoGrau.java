package fundamentos.exercicios;

import java.util.Scanner;

public class calculadoraEquacaoSegundoGrau {

    public static void main(String[] args) {
        
        // Título
        System.out.println("=".repeat(32));
        System.out.println("CALCULADORA EQUAÇÃO 2° GRAU");
        System.out.println("=".repeat(32));

        // Recebendo valores do usuário
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Coenficiente A: ");
        int coeficienteA = entrada.nextInt();

        System.out.printf("Coenficiente B: ");
        int coeficienteB = entrada.nextInt();

        System.out.printf("Coenficiente C: ");
        int coeficienteC = entrada.nextInt();

        System.out.println("=".repeat(32));

        // Realizando cálculos
        // Delta
        int delta = (coeficienteB * coeficienteB) - (4 * coeficienteA * coeficienteC);

        // Fórmula de Bhaskara
        double x1 = (-coeficienteB + Math.sqrt(delta)) / (2 * coeficienteA);
        double x2 = (-coeficienteB - Math.sqrt(delta)) / (2 * coeficienteA);

        // Mostrando valores na tela
        System.out.printf("Sua equação é: %dx² + %d + %d = 0\n", coeficienteA, coeficienteB, coeficienteC);

        System.out.println("=".repeat(32));

        System.out.printf("O Delta é igual a: %d", delta);
        System.out.printf("\nO x1 da equação é: %.2f", x1);
        System.out.printf("\nO x2 da equação é: %.2f\n", x2);

        System.out.println("=".repeat(32));

        entrada.close();
    }

}
