package exercicios.entites;

public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    // Construtor padrão
    public Operario() {
    }

    // Construtor com todos os atributos, incluindo os herdados
    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    // Getters e Setters
    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
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
        return salarioBase + (valorProducao * comissao / 100);
    }
    
    @Override
    public String toString() {
        return String.format(
        		"Operario:\n"
                + "Nome: %s \n"
                + "Endereco: %s \n"
                + "Telefone: %s \n"
                + "Código do Setor: %d \n"
                + "Salário Base: %.2f \n"
                + "Imposto: %.2f%% \n"
                + "Valor de Produção: %.2f \n"
                + "Comissão: %.2f%%",
                getNome(), getEndereco(), getTelefone(), getCodigoSetor(), getSalarioBase(), getImposto(), valorProducao, comissao);
    }
}

