package Model;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Endereco endereco = new Endereco("Mamanguape", "Tibiri 2", "Santa Rita", "CASA", 22, 58302315);
		Pessoa pessoa = new Pessoa("Cleef Souza", "105.989.665.96", 23, endereco);
		Produto produto = new Produto("Notebook", 001);
		Compra compra = new Compra(pessoa, produto);

		ArrayList<Compra> arraylist = new ArrayList<>();
		arraylist.add(compra);

		for (Compra c : arraylist) {
			System.out.println("# Dados da Compra #\n" + "# CLIENTE #\n" + "Nome: " + c.pessoa.getNome() + "\n" + "CPF: "
					+ c.pessoa.getCpf() + "\n" + "Idade: " + c.pessoa.getIdade() + "\n" + "# PRODUTO #\n" + "Código: "
					+ c.produto.getCodigo() + "\n" + "Produto: " + c.produto.getNome());
		}
	}

}
