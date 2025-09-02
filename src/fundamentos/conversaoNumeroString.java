package fundamentos;

public class conversaoNumeroString {

    public static void main(String[] args) {

        // Criando WRAPPER
        Integer num1 = 10000;
        System.out.printf("Número 1: %s", num1.toString()); // Mostrando na tela
        System.out.printf("\nQtd Caracteres: %s", num1.toString().length());
        System.out.printf("\nTipo: %s", num1.getClass().getSimpleName());

        System.out.println("\n---");

        // Usando WRAPPER diretamente
        int num2 = 100000;
        System.out.printf("Número 2: %s", Integer.toString(num2));
        System.out.printf("\nQtd Caracteres: %s", Integer.toString(num2).length());
        System.out.printf("\nTipo: %s", Integer.toString(num2).getClass().getSimpleName());

        System.out.println("\n---");

        // Concatenando com uma String
        System.out.println(("" + num1).getClass().getSimpleName());
        System.out.println(("" + num2).getClass().getSimpleName());
    }

}
