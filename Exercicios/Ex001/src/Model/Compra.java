package Model;

public class Compra {
	Produto produto;
	Pessoa pessoa;
	
	public Compra(Pessoa pes, Produto pro){
		this.pessoa = pes;
		this.produto = pro;
	}
	
	/*
	 * Getters e Setters 
	 */
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
}
