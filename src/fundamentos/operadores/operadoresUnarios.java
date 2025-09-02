package fundamentos.operadores;

public class operadoresUnarios {

    public static void main(String[] args) {
        
        int a = 1;
        int b = 2;

        a++; // a = 2
        a--; // a = 1

        b++; // b = 3
        b--; // b = 2

        System.out.println(a);
        System.out.println(b);

        System.out.println("\nTeste:");
        System.out.println(++a == b--); // 2 == 2 e DEPOIS subtrai por -1 no B.
        System.out.println(a == b); // a = 2 e b = 1
        System.out.println(a);
        System.out.println(b);

    }

}
