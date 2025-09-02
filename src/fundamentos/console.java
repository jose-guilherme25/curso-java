package fundamentos;

import java.util.Scanner;

public class console {

    public static void main(String[] args) {

        // Formas de Escrever no Console
        // print
        System.out.print("Bom");
        System.out.print(" Dia!!!\n");

        // println
        System.out.println("Bom");
        System.out.println("Dia!!!");

        // printf
        System.out.printf("Acorde da Música: %s %s %s %s", "C -", "G -", "Am -", "F\n");
        System.out.printf("Nome: %s", "Guilherme\n");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.printf("%s %s tem %d anos.\n", nome, sobrenome, idade);

        entrada.close();

    }

}
