package Model;

public class Gerente extends Funcionario {
	private String usuario;
	private String senha;

	/*
	 * Métodos
	 */

	@Override
	public double calcularBonificacao() {
		return this.getSalario() * 0.6;
	}

	/*
	 * Getters e Setters
	 */

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
