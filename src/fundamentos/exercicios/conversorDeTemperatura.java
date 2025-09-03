package fundamentos.exercicios;

import java.util.Scanner;

public class conversorDeTemperatura {

    public static void main(String[] args) {
        
        // Título
        System.out.println("=".repeat(30));
        System.out.println("CONVERSOR DE TEMPERATURA");
        System.out.println("=".repeat(30));

        // Recebendo valores do usuário
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura em °C: ");
        Double grausCelsius = entrada.nextDouble();

        // Convertendo valores
        Double grausFahrenheit = (grausCelsius * 1.8) + 32;
        Double grausKelvin = grausCelsius + 273.15;

        // Mostrando resultados na tela
        System.out.println("=".repeat(30));

        System.out.printf("Celsius: %.1f°C", grausCelsius);
        System.out.printf("\nFahrenheit: %.2f°F", grausFahrenheit);
        System.out.printf("\nKelvin: %.2f K\n", grausKelvin);

        System.out.println("=".repeat(30));

        entrada.close();

    }

}
