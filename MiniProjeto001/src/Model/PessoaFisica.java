package Model;

/**
 * @author cleefsouza
 *
 */

public class PessoaFisica extends Pessoa {
	private String cpf; // Ex: 111.222.333-44
	private String rg; // Ex> 1.234.567

	// Construtor
	public PessoaFisica() {

	}

	public PessoaFisica(String nom, float ren, int sit, Endereco end, String cpf, String rg) {
		super(nom, ren, sit, end);
		this.cpf = cpf;
		this.rg = rg;

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

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
}
