package Model;

import java.util.Date;
import java.util.List;

/**
 * @author cleefsouza
 *
 */

public class Conta {
	private String numeroConta; // Ex: 12345-6
	private Date dataAbertura; // Ex: 01/01/1001
	private Date dataEncerramento; // Ex: 01/01/1001
	private int situacaoConta = 1; // Ex: 1 - ativa, 0 - inativa
	private String senha; // Ex: abc123
	private double saldo; // Ex: 1500.0
	private List<Movimento> movimentos; // Objeto do tipo Movimento

	// Construtor
	public Conta(String num, Date abe, Date enc, String sen, double sal) {
		this.numeroConta = num;
		this.dataAbertura = abe;
		this.dataEncerramento = enc;
		this.senha = sen;
		this.saldo = sal;
	}

	/*
	 * Métodos
	 */

	public void sacar(double valor) {

	}

	public void depositar(double valor) {

	}

	public void transferir(double valor, Conta c) {

	}

	public void registrarMovimentacao(Movimento m) {

	}

	/*
	 * Getters e Setters
	 */

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public Date getDataEncerramento() {
		return dataEncerramento;
	}

	public void setDataEncerramento(Date dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}

	public int getSituacaoConta() {
		return situacaoConta;
	}

	public void setSituacaoConta(int situacaoConta) {
		this.situacaoConta = situacaoConta;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public List<Movimento> getMovimentos() {
		return movimentos;
	}

	public void setMovimentos(List<Movimento> movimentos) {
		this.movimentos = movimentos;
	}
}
