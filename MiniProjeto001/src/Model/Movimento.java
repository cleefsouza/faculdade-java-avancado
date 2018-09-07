package Model;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * @author cleefsouza
 *
 */

public class Movimento {
	private int tipo; // Ex: 1 - sacar, 2 - depositar, 3 - transferir
	private Date dataMovimentacao; // Ex: 01/01/1001
	private Timestamp horaMovimentacao; // Ex: 00:00
	private double valorMovimentacao; // Ex: 500.0

	// Construtor
	public Movimento() {
		
	}

	/*
	 * Getters e Setters
	 */

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public Date getDataMovimentacao() {
		return dataMovimentacao;
	}

	public void setDataMovimentacao(Date dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}

	public Timestamp getHoraMovimentacao() {
		return horaMovimentacao;
	}

	public void setHoraMovimentacao(Timestamp horaMovimentacao) {
		this.horaMovimentacao = horaMovimentacao;
	}

	public double getValorMovimentacao() {
		return valorMovimentacao;
	}

	public void setValorMovimentacao(double valorMovimentacao) {
		this.valorMovimentacao = valorMovimentacao;
	}
}
