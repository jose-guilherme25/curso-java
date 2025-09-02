package fundamentos;

public class conversaoTiposPrimitivosNumericos {

    public static void main(String[] args) {

        double a = 1; // implícita
        System.out.println(a);

        float b = (float) 1.1234567898765; // explícita
        double z = 1.1234567898765;
        System.out.println(b);
        System.out.println(z);

        int c = 340;
        byte d = (byte) c; // explícita (CAST)
        System.out.println(d);

        double e = 1.999999;
        int f = (int) e; // explícita (CAST) - perda de dados
        System.out.println(f);
    }

}
