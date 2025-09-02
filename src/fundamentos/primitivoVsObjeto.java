package fundamentos;

public class primitivoVsObjeto {

    public static void main(String[] args) {

        // Objetos possuem atributos e comportamentos
        String s = new String("texto");
        System.out.println(s.toUpperCase());

        // WRAPPERS são a versão objeto dos tipos primitivos
        int a = 123;
        System.out.println(a);
    }

}
