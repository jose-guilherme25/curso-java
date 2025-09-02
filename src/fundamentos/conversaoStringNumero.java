package fundamentos;

import javax.swing.JOptionPane;

public class conversaoStringNumero {

    public static void main(String[] args) {

        String valor1 = JOptionPane.showInputDialog("Digite o seu primeiro número: ");
        String valor2 = JOptionPane.showInputDialog("Digite o seu segundo número: ");

        System.out.println(valor1 + valor2);

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);

        double soma = num1 + num2;

        System.out.println("A soma é: " + soma);
        System.out.println("A média é: " + soma/2);
        
    }

}
