package Ex003;

public class Pessoa {

	private String nome;
	private int idade;
	
	/*
	 * Métodos
	 */
	
	public int obterIdade(){
		return this.getIdade();
	}

	/*
	 * Getters e Setters
	 */

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) throws IdadeException {
		if (idade <= 0) {
			throw new IdadeException("Idade menor ou igual a zero!");  // Recebe mensagem que será enviada para a superclasse
		} else {
			this.idade = idade;
		}
	}

}
