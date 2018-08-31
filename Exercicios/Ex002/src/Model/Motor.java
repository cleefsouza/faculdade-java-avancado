package Model;

public class Motor {
	private double preco;
	private double potencia;
	private String fabricante;
	
	public Motor(double pre, double pot, String fab){
		this.fabricante = fab;
		this.preco = pre;
		this.potencia = pot;
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
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
}
