package fundamentos.operadores;

public class operadoresAtribuicao {

    public static void main(String[] args) {
        
        int a = 3;
        int b = a;
        int c = a + b;

        // Atribuindo valores
        c += b; // c = 9
        c -= a; // c = 6
        c *= b; // c = 18
        c /= a; // c = 6
        System.out.println(c);

        c %= 2; // c = 0
        System.out.println(c);

    }

}
