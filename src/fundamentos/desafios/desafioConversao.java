package fundamentos.desafios;

import java.util.Scanner;

public class desafioConversao {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu 1° Salário: R$");
        String valor1 = entrada.next().replace(",", ".");

        System.out.print("Digite o seu 2° Salário: R$");
        String valor2 = entrada.next().replace(",", ".");

        System.out.print("Digite o seu 3° Salário: R$");
        String valor3 = entrada.next().replace(",", ".");

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);

        double somaSalarios = salario1 + salario2 + salario3;
        double media = (somaSalarios / 3);

        System.out.println();

        System.out.printf("Salários: R$%.2f + R$%.2f + R$%.2f", salario1, salario2, salario3);
        System.out.printf("\nSoma dos Salários: R$%.2f", somaSalarios);
        System.out.printf("\nMédia: R$%.2f", media);

        entrada.close();

    }

}
