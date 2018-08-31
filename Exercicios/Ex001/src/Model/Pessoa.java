package Model;

public class Pessoa {
	private String nome;
	private String cpf;
	private int idade;
	Endereco endereco;

	public Pessoa(String nom, String cpf, int ida, Endereco end){
		this.nome = nom;
		this.idade = ida;
		this.cpf = cpf;
		this.endereco = end;
	}
	
	/*
	 * Getters e Setters
	 */

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
