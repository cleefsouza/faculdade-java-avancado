package Model;

/**
 * @author cleefsouza
 *
 */

public class Pessoa {
	private String nome; // Ex: Java People
	private float rendaPessoa; // Ex: 12000.0
	private int situacaoPessoa; // Ex: 1 - ativa, 0 - inativa
	
	/*
	 * Getters e Setters 
	 */
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getRendaPessoa() {
		return rendaPessoa;
	}
	public void setRendaPessoa(float rendaPessoa) {
		this.rendaPessoa = rendaPessoa;
	}
	public int getSituacaoPessoa() {
		return situacaoPessoa;
	}
	public void setSituacaoPessoa(int situacaoPessoa) {
		this.situacaoPessoa = situacaoPessoa;
	}
}
