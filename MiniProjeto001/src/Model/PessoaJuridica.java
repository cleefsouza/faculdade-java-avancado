package Model;

/**
 * @author cleefsouza
 *
 */

public class PessoaJuridica extends Pessoa {
	private String cnpj; // Ex: 12.345.678/9123-45
	
	// Construtor
	public PessoaJuridica(String nom, float ren, int sit, Endereco end, String cnpj) {
		super(nom, ren, sit, end);
		this.cnpj = cnpj;
	}
	
	/*
	 * Getters e Setters
	 */

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
