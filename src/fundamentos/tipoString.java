package fundamentos;

public class tipoString {

    public static void main(String[] args) {

        String nome = "José";
        String nome2 = "JOSÉ";
        String sobrenome = "Matias";
        int idade = 18;
        double altura = 1.76;

        // Mostrando valor no indice 2
        System.out.println(nome.charAt(2));

        // Concatenando
        System.out.println(nome.concat(sobrenome));
        System.out.println(nome + "!!!");

        // Tamanho da String
        System.out.println(nome.length());

        // String em Maiúsculas e Minúsculas
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());

        // Comparando String
        System.out.println(nome.equals(nome2));
        System.out.println(nome.equalsIgnoreCase(nome2));

        // Verificando o Inicio e o Fim
        System.out.println(nome.startsWith("J"));
        System.out.println(nome.endsWith("é"));

        // Extraindo Partes
        System.out.println(nome.substring(0, 2));
        System.out.println(nome.substring(2));

        // Substituindo Texto
        System.out.println(nome.replace(nome, sobrenome));

        // Removendo Espaços
        String espacosCF = "   Tipo String   ";
        System.out.println(espacosCF.trim());

        // Dividindo String
        String listaCompras = "frutas,maçã,banana,leite,aveia";
        String[] itens = listaCompras.split(",");
        for (String i : itens) {
            System.out.println(i);
        }

        // Localizando Posição
        System.out.println(nome.indexOf("J"));
        System.out.println(nome.lastIndexOf("o"));

        // Verificando Conteúdo
        String descricao = "Meu nome é José, e eu estudo Java.";
        System.out.println(descricao.contains("Java"));
        System.out.println(descricao.isEmpty());

        System.out.println();

        String frase1 = String.format("Nome: %s %s, \n%d anos de idade, \n%.2fm de altura!", nome, sobrenome, idade, altura);
        System.out.println(frase1);

        System.out.println();

        System.out.printf("Nome: %s %s, \n%d anos de idade, \n%.2fm de altura!", nome, sobrenome, idade, altura);
    }
}
