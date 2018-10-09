package Model;

/**
 * 
 * @author cleefsouza
 *
 */
public class Pessoa {
	// Atributos
	private String cpf;
	private String nome;
	private String rg;
	private int idade;

	/*
	 * Getters e Setters
	 */
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
