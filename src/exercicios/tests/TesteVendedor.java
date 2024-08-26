package exercicios.tests;

import exercicios.entites.Vendedor;

public class TesteVendedor {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Ana Lima", "Rua Nova, 654", "9999-4444", 104, 3500.0, 10.0, 30000.0, 3.0);

        System.out.println(vendedor.toString());
        System.out.println(String.format("Salário Líquido: %.2f ", vendedor.calcularSalario()));
    }
}

