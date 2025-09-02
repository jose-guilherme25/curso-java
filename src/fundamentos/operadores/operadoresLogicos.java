package fundamentos.operadores;

public class operadoresLogicos {

    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        System.out.println(condicao1 && condicao2); // true e false = false
        System.out.println(condicao1 || condicao2); // true ou false = true
        System.out.println(condicao1 ^ condicao2); // true ou false = true
        System.out.println(!condicao1); // not true = false
        System.out.println(!!condicao2); // not false not true = false

        // Tabela Verdade
        System.out.println("\nTabela verdade E (AND):");
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && false); // false
        System.out.println(false && true); // false

        System.out.println("\nTabela verdade OU (OR):");
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || false); // false
        System.out.println(false || true); // true

        System.out.println("\nTabela verdade OU Exclusivo (XOR):");
        System.out.println(true ^ true); // false
        System.out.println(true ^ false); // true
        System.out.println(false ^ false); // false
        System.out.println(false ^ true); // true

        System.out.println("\nTabela verdade NÃO (NOT):");
        System.out.println(!true); // false
        System.out.println(!false); // true
        
        System.out.println("\nTabela verdade NÃO NÃO (NOT NOT):");
        System.err.println(!!true); // true
        System.err.println(!!false); // false
        
    }

}
