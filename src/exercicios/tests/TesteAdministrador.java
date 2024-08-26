package exercicios.tests;

import exercicios.entites.Administrador;

public class TesteAdministrador {
    public static void main(String[] args) {
        Administrador administrador = new Administrador("Maria Souza", "Rua das Oliveiras, 789", "9999-6666", 102, 5000.0, 15.0, 1000.0);

        System.out.println(administrador.toString());
        System.out.println(String.format("Salário Líquido: %.2f ", administrador.calcularSalario()));
    }
}

