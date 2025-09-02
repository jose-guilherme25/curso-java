package fundamentos;

public class tiposPrimitivos {

    public static void main(String[] args) {
        // Informações do Funcionário

        // Tipos Númericos Inteiros
        byte anosDeEmpresa = 18;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3134845223L; // Para especificarmos que o valor é um Literal LONG, devemos usar o "L" ou "l"

        // Tipos Númericos Reais (Com ponto flutuante)
        float salario = 11445.44F; // Para especificarmos que o valor é um Literal FLOAT, devemos usar o "F" ou "f"
        double vendasAcumuludas = 2991797103.01;

        // Tipo Booleano
        boolean estaDeFerias = true; // Apenas "true", "false"

        // Tipo Caractere
        char status = 'A'; // Apenas UM caractere e dentro de aspas simples

        // Cálculos
        // Dias de Empresa
        System.out.println("O funcionário tem " + anosDeEmpresa * 365 + " dias de Empresa.");

        // Número de Viagens
        System.out.println("O funcionário viajou " + numeroDeVoos / 2 + " vezes.");

        // Pontos por Real
        System.out.println("O funcionário tem " + pontosAcumulados/vendasAcumuludas + " pontos por real.");

        // Informando salário
        System.out.println("O funcionário com o ID: " + id + " ganha -> R$" + salario);

        // Férias
        System.out.println("O funcionários está de férias? " + estaDeFerias);

        // Status
        System.out.println("(A) - Ativo");
        System.out.println("(I) - Inativo");

        System.out.println("Status do funcionário: " + status);

    }

}
