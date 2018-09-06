package Model;

import java.util.List;

/**
 * @author cleefsouza
 *
 */

public class Agencia {
	private String numero; // Ex: 1234-5
	private Endereco endereco; // Ex: Objeto do tipo Endereco
	private List<Conta> contas; // Ex: Objetos do tipo Conta

	// Construtor
	public Agencia(String num, Endereco end) {
		this.numero = num;
		this.endereco = end;
	}

	/*
	 * Métodos
	 */

	public void cadastrarConta(Conta c) {

	}

	/*
	 * Getters e Setters
	 */

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
}
