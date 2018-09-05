package Model;

/**
 * @author cleefsouza
 *
 */

public class Endereco {
	private String rua; // Ex: Amazing Grace
	private String cep; // Ex: 58302-000
	private String bairro; // Ex: Throwable
	private String numero; // Ex: 256b
	private String cidade; // Ex: Hole Java

	/*
	 * Getters e Setters
	 */

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
}
