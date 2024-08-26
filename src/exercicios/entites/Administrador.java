package exercicios.entites;

public class Administrador extends Empregado {
    private double ajudaDeCusto;

    public Administrador() {
    }

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto =  ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto =  ajudaDeCusto;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
    }
    
    @Override
    public String toString() {
        return String.format(
        		"Administrador:\n"
        		+ "Nome: %s \n"
        		+ "Endereco: %s \n"
        		+ "Telefone: %s \n"
        		+ "Código do Setor: %d \n"
        		+ "Salario Base: %.2f \n"
        		+ "Imposto: %.2f%% \n"
        		+ "Ajuda de Custos: %.2f",
                getNome(), getEndereco(), getTelefone(), getCodigoSetor(), getSalarioBase(), getImposto(), ajudaDeCusto);
    }
}
