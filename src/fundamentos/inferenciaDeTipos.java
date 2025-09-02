package fundamentos;

public class inferenciaDeTipos {

    /* Inferência de Tipos
     * O próprio Java associa um TIPO de acordo com o valor atribuido a variável.
     * VAR NOME = VALOR;
     * 
     * OBSERVAÇÕES:
     * 1 - Sempre precisamos atribuir valores de acordo com o tipo que foi inicializado.
     * 2 - Precisamos declarar e inicializar a variável na mesma linha (para o Java associar o TIPO).
     * 3 - Variáveis do tipo DOUBLE podem receber valores INT.
     * Mas... Variáveis do tipo INT não podem receber valores DOUBLE.
     */

     public static void main(String[] args) {
        
        double valorDouble = 1.76; // Variável do tipo DOUBLE declarada e inicializada.
        System.out.println(valorDouble);

        var nomeMasculino = "Paulo"; // Variável do tipo STRING.
        System.out.println(nomeMasculino);

        var saldoNaConta = 200.50; // Variável do tipo DOUBLE.
        System.out.println(saldoNaConta);

        saldoNaConta = 300; // Valor INT atribuido a uma variável DOUBLE.
        System.out.println(saldoNaConta);

        double pesoDoPaciente; // Variável DOUBLE declarada!
        pesoDoPaciente = 65.3; // Variável DOUBLE inicializada!
        System.out.println(pesoDoPaciente); // Variável DOUBLE usada!

        var numeroCasa = 322; // Variável do tipo INTEIRO.
        System.out.println(numeroCasa);
     }

}
