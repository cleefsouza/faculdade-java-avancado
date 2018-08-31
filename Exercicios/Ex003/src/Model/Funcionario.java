package Model;

public class Funcionario {
	private String nome;
	private double salario;

	/*
	 * Métodos
	 */
	
	public double calcularBonificacao() { // Retorna o valor da binificação
		return (this.salario * 0.10);
	}

	/*
	 * Getters e Setters
	 */

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
