package Model;

public class Produto {
	private int codigo;
	private String nome;
	
	public Produto(String nom, int cod){
		this.nome = nom;
		this.codigo = cod;
	}
	
	/*
	 * Getters e Setters
	 */
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
