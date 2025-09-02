package fundamentos.desafios;

public class desafioLogicos {

    public static void main(String[] args) {
        
        boolean trabalho1 = true;
        boolean trabalho2 = false;

        boolean tv50 = trabalho1 && trabalho2;
        boolean tv32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;

        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Trabalho 1: " + trabalho1);
        System.out.println("Trabalho 2: " + trabalho2);

        System.out.println("\nComprar TV50: " + tv50);
        System.out.println("Comprar TV32: " + tv32);
        System.out.println("Comprou Sorvete: " + comprouSorvete);

        System.out.println("\nMais saudável: " + maisSaudavel);
    }

}
