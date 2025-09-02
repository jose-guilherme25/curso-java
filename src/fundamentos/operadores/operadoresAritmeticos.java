package fundamentos.operadores;

public class operadoresAritmeticos {

    public static void main(String[] args) {

        System.out.println(2 + 3); // diretamente no console

        var x = 20.50;
        double y = 10.50;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);

        System.out.println();

        int a = 8;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a / (double) b); // mais preciso
        System.out.println(a / (float) b);


        System.out.println(a % b);
        System.out.println(8 % 3);

        System.out.println((x - y) - (a * b));

    }

}
