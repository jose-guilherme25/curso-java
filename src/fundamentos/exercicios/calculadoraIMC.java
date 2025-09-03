package fundamentos.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class calculadoraIMC {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // definindo localização p/ Estados Unidos

        // Títulos
        System.out.println("=".repeat(40));
        System.out.println("CALCULADORA DE IMC");
        System.out.println("=".repeat(40));

        // Recebendo valores do usuário
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe seu peso: ");
        double peso = entrada.nextDouble();

        System.out.print("Informe sua altura: ");
        double altura = entrada.nextDouble();

        // Realizando cálculo
        double imc = peso / (Math.pow(altura, 2));

        // Classificando resultado
        String classificacao = imc < 18.5 ? "Abaixo do Peso" : "Valor inválido!";
        classificacao = imc >= 18.5 && imc < 25 ? "Peso Normal" : classificacao;
        classificacao = imc >= 25 && imc < 30 ? "Sobrepeso" : classificacao;
        classificacao = imc >= 30 && imc < 35 ? "Obesidade Grau I" : classificacao;
        classificacao = imc >= 35 && imc < 40 ? "Obesidade Grau II" : classificacao;
        classificacao = imc >= 40 ? "Obesidade Grau III" : classificacao;

        // Mostrando resultado na tela
        System.out.println("=".repeat(40));

        System.out.printf("Seu peso: %.2fkg", peso);
        System.out.printf("\nSua altura: %.2f m²", altura);
        System.out.printf("\nSeu IMC: %.2f", imc);
        System.out.printf("\nSua classificação: %s\n", classificacao);

        System.out.println("=".repeat(40));

        entrada.close();
    }

}
