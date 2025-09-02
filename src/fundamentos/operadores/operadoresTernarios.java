package fundamentos.operadores;

public class operadoresTernarios {

    public static void main(String[] args) {
        
        double media = 9.5;

        String resultadoFinal = media >= 7.0 ? "aprovado" : "em recuperação";
        System.out.printf("O aluno está %s", resultadoFinal);

        boolean bomComportamento = true;
        boolean passouPorMedia = media >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;

        String resultadoNegociacao = temDesconto ? "Sim" : "Não";
        System.out.printf("\nTem desconto? %s", resultadoNegociacao);
    }

}
