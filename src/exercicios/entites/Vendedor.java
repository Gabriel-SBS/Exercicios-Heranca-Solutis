package exercicios.entites;

public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    // Construtor padrão
    public Vendedor() {
    }

    // Construtor com todos os atributos, incluindo os herdados
    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    // Getters e Setters
    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    // Redefinição do método calcularSalario
    @Override
    public double calcularSalario() {
        double salarioBase = super.calcularSalario();
        return salarioBase + (valorVendas * comissao / 100);
    }
    
    @Override
    public String toString() {
        return String.format("Vendedor:\n"
                + "Nome: %s \n"
                + "Endereco: %s \n"
                + "Telefone: %s \n"
                + "Código do Setor: %d \n"
                + "Salário Base: %.2f \n"
                + "Imposto: %.2f%% \n"
                + "Valor de Vendas: %.2f \n"
                + "Comissão: %.2f%%",
                getNome(), getEndereco(), getTelefone(), getCodigoSetor(), getSalarioBase(), getImposto(), valorVendas, comissao);
    }

}