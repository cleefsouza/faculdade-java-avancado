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

	// Construtores
	public Pessoa(){
		
	}

	public Pessoa(String nom, String cpf, String rg, int ida){
		this.nome = nom;
		this.cpf = cpf;
		this.rg = rg;
		this.idade = ida;
	}

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
