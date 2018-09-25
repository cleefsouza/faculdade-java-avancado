package Model;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private int idade;
	
	// Construtor
	public Pessoa(String nom, String sob, int ida) {
		this.nome = nom;
	}

	/*
	 * Métodos
	 */

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}	
}