package exercicios.tests;

import exercicios.entites.Fornecedor;

public class TesteFornecedor {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Empresa XYZ", "Rua das Flores, 123", "9999-8888", 50000.0, 10000.0);

        System.out.println(fornecedor.toString());
        System.out.println(String.format("Saldo do Fornecedor: %.2f ", fornecedor.obterSaldo()));
    }
}

