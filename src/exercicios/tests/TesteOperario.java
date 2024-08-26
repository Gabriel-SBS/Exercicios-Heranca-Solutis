package exercicios.tests;

import exercicios.entites.Operario;

public class TesteOperario {
    public static void main(String[] args) {
        Operario operario = new Operario("Carlos Pereira", "Rua Velha, 321", "9999-5555", 103, 2500.0, 12.0, 20000.0, 5.0);

        System.out.println(operario.toString());
        System.out.println(String.format("Salário Líquido: %.2f ", operario.calcularSalario()));
    }
}

