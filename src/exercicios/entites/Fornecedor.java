package exercicios.entites;

public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;

    public Fornecedor() {
    }

    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double obterSaldo() {
        return valorCredito - valorDivida;
    }
    
    @Override
    public String toString() {
        return String.format("Fornecedor:\n"
                + "Nome: %s \n"
                + "Endereco: %s \n"
                + "Telefone: %s \n"
                + "Valor de Crédito: %.2f \n"
                + "Valor de Dívida: %.2f",
                getNome(), getEndereco(), getTelefone(), valorCredito, valorDivida);
    }
}