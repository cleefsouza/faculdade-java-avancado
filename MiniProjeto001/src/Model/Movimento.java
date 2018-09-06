package Model;

import java.util.Date;

/**
 * @author cleefsouza
 *
 */

public class Movimento {
	private int tipo; // Ex: 1 - sacar, 2 - depositar, 3 - transferir
	private Date dataMovimentacao; // Ex: 01/01/1001
	private Date horaMovimentacao; // Ex: 00:00
	private float valorMovimentacao; // Ex: 500.0

	// Construtor
	public Movimento(int tip, Date dat, Date hor, float val) {
		this.tipo = tip;
		this.dataMovimentacao = dat;
		this.horaMovimentacao = hor;
		this.valorMovimentacao = val;
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

	public Date getHoraMovimentacao() {
		return horaMovimentacao;
	}

	public void setHoraMovimentacao(Date horaMovimentacao) {
		this.horaMovimentacao = horaMovimentacao;
	}

	public float getValorMovimentacao() {
		return valorMovimentacao;
	}

	public void setValorMovimentacao(float valorMovimentacao) {
		this.valorMovimentacao = valorMovimentacao;
	}
}
