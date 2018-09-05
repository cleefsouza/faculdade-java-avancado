package Ex002;

public class Conta {
	private double saldo;
	private double limite;
	private String numero;

	/*
	 * Métodos
	 */

	public Conta(String num, double sal, double lim) {
		this.numero = num;
		this.saldo = sal;
		this.limite = lim;
	}

	public void sacar(double valor) throws SaldoNegativoException {
		if (this.getSaldo() < 0 || valor>this.getSaldo() || valor>this.getLimite()) {
			throw new SaldoNegativoException("Saque não realizado: Saldo negativo ou ultrapassou o limite!");  // Recebe a mensagem que será enviada para a superclasse
		} else {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Saque realizado com sucesso!\nSaldo atual: " + this.obterSaldo());
		}
	}

	public void depositar(double valor) throws ValorException{
		if(valor<=0){
			throw new ValorException("Depósito invalido: Valor menor ou igual a zero!"); // Recebe a mensagem que será enviada para a superclasse
		} else {
			this.setSaldo(this.getSaldo() + valor);	
			System.out.println("Depósito realizado com sucesso!\nSaldo atual: " + this.obterSaldo());
		}

	}

	public double obterSaldo() {
		return this.getSaldo();
	}

	/*
	 * Getters e Setters
	 */

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
}
