package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
	List<Contato> contatos = new ArrayList<>();
	static Scanner ent = new Scanner(System.in);

	// Inseri um contato na lista
	public void inserir(Contato c) {
		this.contatos.add(c); // Adiciona um contato a lista
	}

	// Altera um contato dalista
	public void alterar(int i) {
		Contato c = this.contatos.get(i);

		boolean ver = true;
		while (ver == true) {
			System.out.print("1 - Alterar nome\n2 - Alterar cpf\n3 - Alterar telefone\n4 - Sair\n>>> ");
			int opc = ent.nextInt();
			ent = new Scanner(System.in);

			switch (opc) {
			case 1:
				System.out.print("Novo nome >>> ");
				c.setNome(ent.nextLine());
				break;
			case 2:
				System.out.print("Novo cpf >>> ");
				c.setCpf(ent.nextLine());
				break;
			case 3:
				System.out.print("Novo telefone >>> ");
				c.setTelefone(ent.nextLine());
				break;
			case 4:
				System.out.println("Alterações finalizadas!");
				ver = false;
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
			this.contatos.set(i, c); // Realizando alterações
		}
	}

	// Remove um contato da lista
	public void remover(int i) {
		this.contatos.remove(i); // Removendo contato da coleção
	}

	// Lista todos os contatos da lista
	public void listar() {
		for (Contato c : this.contatos) { // Listando contatos
			System.out.println("Código >>> " + contatos.indexOf(c) + "\nNome >>> " + c.getNome() + "\nCPF >>> "
					+ c.getCpf() + "\nTelefone >>> " + c.getTelefone() + "\n----");
		}
	}

	// Procura um contato por nome
	public void pesquisarNome(String n) {
		for (Contato c : this.contatos) { // Percorre a lista até achar o nome informado
			if (c.getNome().equals(n)) {
				System.out.println("----\nCódigo >>> " + contatos.indexOf(c) + "\nNome >>> " + c.getNome()
						+ "\nCPF >>> " + c.getCpf() + "\nTelefone >>> " + c.getTelefone());
			}
		}
	}

	// Procura um contato por telefone
	public void pesquisarTelefone(String t) {
		for (Contato c : this.contatos) { // Percorre a lista até achar o nome informado
			if (c.getTelefone().equals(t)) {
				System.out.println("----\nCódigo >>> " + contatos.indexOf(c) + "\nNome >>> " + c.getNome()
						+ "\nCPF >>> " + c.getCpf() + "\nTelefone >>> " + c.getTelefone());
			}
		}
	}
}
