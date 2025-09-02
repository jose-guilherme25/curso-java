package fundamentos.desafios;

public class desafioTemperatura {

    public static void main(String[] args) {
        
        // Fórmula do Desafio
        // °C = (°F - 32) * 5/9

        final double AJUSTE = 32;
        final double MULTIPLICADOR = 5.0 / 9.0;

        double fahrenheit = 86;
        double celsius = (fahrenheit - AJUSTE) * MULTIPLICADOR;

        System.out.println("A temperatura: " + fahrenheit + " °F é igual a: " + celsius + "°C");
        
        fahrenheit = 100;
        celsius = (fahrenheit - AJUSTE) * MULTIPLICADOR;

        System.out.println("A temperatura: " + fahrenheit + " °F é igual a: " + celsius + "°C");
    }

}
