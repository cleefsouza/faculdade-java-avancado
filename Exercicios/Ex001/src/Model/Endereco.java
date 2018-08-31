package Model;

public class Endereco {

	private String rua;
	private String bairro;
	private String cidade;
	private String complemento;
	private int numero;
	private int cep;
	
	public Endereco(String rua, String bai, String cid, String comp, int num, int cep){
		this.rua = rua;
		this.bairro = bai;
		this.cidade = cid;
		this.complemento = comp;
		this.numero = num;
		this.cep = cep;
	}
	
	/*
	 * Getters e Setters
	 */
	
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

}
