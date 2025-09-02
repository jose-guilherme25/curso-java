package fundamentos.operadores;

public class operadoresRelacionais {
    
    public static void main(String[] args) {
        
        int a = 97;
        int b = 'a';
        // A variável "b" vai usar o código UNICODE
        System.out.println("\u0061"); // a

        // Operadores Relacionais
        System.out.println(a == b); // true
        System.out.println(20 != 10); // true
        System.out.println(5 > 2); // true
        System.out.println(5 >= 5); // true
        System.out.println(2 < 7); // true
        System.out.println(3 <= 5); // true

        double nota = 7.5;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;

        System.out.println("\nNota: " + nota);
        System.out.println("Bom comportamento: " + bomComportamento);
        System.out.println("Passou por média: " + passouPorMedia);
        System.out.println("Tem desconto: " + temDesconto);

    }

}
