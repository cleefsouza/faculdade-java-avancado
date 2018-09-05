package Model;

/**
 * @author cleefsouza
 *
 */

public class PessoaJuridica extends Pessoa {
	private String cnpj; // Ex: 12.345.678/9123-45 
	
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
