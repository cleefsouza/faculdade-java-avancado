package Model;

public class Pneu {
	private double preco;
	private double aro;
	private String fabricante;
	
	public Pneu(double pre, double aro, String fab){
		this.fabricante = fab;
		this.preco = pre;
		this.aro = aro;
	}
	
	/*
	 *	Getters e Setters 
	 */
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getAro() {
		return aro;
	}
	public void setAro(double aro) {
		this.aro = aro;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	
}
