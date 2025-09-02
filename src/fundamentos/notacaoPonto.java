package fundamentos;

public class notacaoPonto {

    public static void main(String[] args) {
        // Notação Ponto
        // Usar o "." (ponto) para acessar os métodos de variáveis.

        // Os tipos primitivos não tem o operador "."
        // Os tipos primitivos armazenam apenas o PRÓPRIO VALOR.
        // Não usamos métodos e nem atributos para Tipos Primitivos.

        // Usamos a notação "." com todo o resto da API do Java, com exceção dos 8 tipos primitivos.
        // Objetos tem atributos e comportamentos usando o "."

        String nome = "Guilherme";
        System.out.println("Nome: " + nome);

        nome = nome.toUpperCase();
        System.out.println("Nome em Maiúsculo: " + nome);

        nome = nome.toLowerCase();
        System.out.println("Nome em Minúsculo: " + nome);

        nome = nome.replace("guilherme", "thiago");
        System.out.println("Nome trocado: " + nome);

        nome = nome.concat("!!!");
        System.out.println("Nome concatenado: " + nome);

        System.out.println("---");

        String carro = "jetta gli".toUpperCase();
        System.out.println(carro);

        String moto = "start 160"
        .replace("start", "titan")
        .toUpperCase()
        .concat(" NOVA");

        System.out.println(moto);
    }

}
