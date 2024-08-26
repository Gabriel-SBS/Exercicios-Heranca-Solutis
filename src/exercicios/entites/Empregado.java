package exercicios.entites;

public class Empregado extends Pessoa {
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public Empregado() {
    }

    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    // Método calcularSalario
    public double calcularSalario() {
        return salarioBase - (salarioBase * imposto / 100);
    }

    
    @Override
    public String toString() {
        return String.format("Empregado:\n"
        		+ "Nome: %s \n"
        		+ "Endereco: %s \n"
        		+ "Telefone: %s \n"
        		+ "Codigo de Setor: %d \n"
        		+ "Salario Base: %.2f \n"
        		+ "Imposto: %.2f%%",
                getNome(), getEndereco(), getTelefone(), codigoSetor, salarioBase, imposto);
    }
}