package Model;

public class Carro {
	String modelo;
	String fabricante;
	private Motor motor;
	private Banco banco;
	private Pneu pneu;
	
	// Construtor
	public Carro(String mod, String fab, Motor mot, Banco ban, Pneu pne){
		this.modelo = mod;
		this.fabricante = fab;
		this.motor = mot;
		this.banco = ban;
		this.pneu = pne;
	}
	
	/*
	 * Métodos
	 */
	
	public double precoCarro(){
		double total = this.motor.getPreco()+this.banco.getPreco()+this.pneu.getPreco();
		return total;
	}
	
	/*
	 * Getters e Setters 
	 */
	
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

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Pneu getPneu() {
		return pneu;
	}

	public void setPneu(Pneu pneu) {
		this.pneu = pneu;
	}
	
}
