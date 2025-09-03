package fundamentos.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class calculadoraAreaDoTriangulo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // definindo localização p/ Estados Unidos

        // Título
        System.out.println("=".repeat(30));
        System.out.println("ÁREA DO TRIÂNGULO");
        System.out.println("=".repeat(30));

        // Recebendo valores do usuário
        Scanner entrada = new Scanner(System.in);

        System.out.print("Base do Triângulo (cm): ");
        double base = entrada.nextDouble();

        System.out.print("Altura do Triângulo (cm): ");
        double altura = entrada.nextDouble();

        // Realizando cálculo
        double areaDoTriangulo = ((base * altura) / 2);

        // Mostrando resultado na tela
        System.out.println("=".repeat(30));

        System.out.printf("Base do Triângulo: %.2f", base);
        System.out.printf("\nAltura do Triângulo: %.2f", altura);
        System.out.printf("\nÁrea do Triângulo: %.2f cm²\n", areaDoTriangulo);

        System.out.println("=".repeat(30));

        entrada.close();
        
    }

}
