package fundamentos;

public class areaCircunferencia {

    public static void main(String[] args) {

        // Variáveis - espaço dentro da memória do computador usado para armazenar valores/dados.
        // TIPO NOME = VALOR
        double raio = 3.4;

        // Constantes - valores que não vão mudar ao longo do projeto.
        // FINAL TIPO NOME_MAIUSCULO = VALOR
        final double PI = 3.14159;

        double areaCircunferencia = PI * raio * raio;

        System.out.println("O Raio da Circunferência é: " + raio);
        System.out.println("O valor de PI é: " + PI);
        System.out.println("A área da circunferência é: " + areaCircunferencia + " m².");

    }

}
