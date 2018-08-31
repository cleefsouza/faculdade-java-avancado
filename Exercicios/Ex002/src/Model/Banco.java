package Model;

public class Banco {
	private double preco;
	private String modelo;
	private String fabricante;
	
	public Banco(double pre, String mod, String fab){
		this.fabricante = fab;
		this.preco = pre;
		this.modelo = mod;
	}
	
	/*
	 * Getters e Setters 
	 */
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
}
