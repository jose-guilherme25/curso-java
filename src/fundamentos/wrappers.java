package fundamentos;

public class wrappers {
    
    public static void main(String[] args) {
        
        Byte b = 100;
        Short num_s = 1000;

        Integer i = 10000; // Int
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(num_s.toString());

        System.out.println(num_s.toString().getClass().getSimpleName()); // Mostra o Tipo da Variável

        System.out.println(i * 5);
        System.out.println(l / 5);

        Float f = 1.756F;
        System.out.println(f);

        Double d = 123.21;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#'; // Char
        System.out.println(c + "...");
    }

}
