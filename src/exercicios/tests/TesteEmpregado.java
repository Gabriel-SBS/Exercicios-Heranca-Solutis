package exercicios.tests;

import exercicios.entites.Empregado;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("João Silva", "Avenida Principal, 456", "9999-7777", 101, 3000.0, 10.0);

        System.out.println(empregado.toString());
        System.out.println(String.format("Salário Líquido: %.2f ", empregado.calcularSalario()));
    }
}

