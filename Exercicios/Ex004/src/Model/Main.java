package Model;

import java.util.Scanner;

/**
 * @author cleefsouza
 *
 */

public class Main {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		Agenda agenda = new Agenda();
		Contato contato;

		while (true) {
			System.out.print(
					"----\nMenu\n----\n1 - Inserir Contato\n2 - Alterar Contato\n3 - Listar Contatos\n4 - Remover Contato\n5 - Pesquisar por Nome\n6 - Pesquisar por Telefone\n7 - Encerrar\n>>> ");
			int opc = ent.nextInt();
			ent = new Scanner(System.in); // Zerando scanner

			switch (opc) {
			case 1:
				System.out.println("----");
				contato = new Contato();

				System.out.print("Digite o nome >>> ");
				contato.setNome(ent.nextLine());

				System.out.print("Digite o CPF >>> ");
				contato.setCpf(ent.nextLine());

				System.out.print("Digite o telefone >>> ");
				contato.setTelefone(ent.nextLine());

				agenda.inserir(contato);
				break;
			case 2:
				System.out.print("----\nDigite o código do contato >>> ");
				agenda.alterar(ent.nextInt());
				break;
			case 3:
				System.out.println("----");
				agenda.listar();
				break;
			case 4:
				System.out.print("----\nDigite o código do contato >>> ");
				agenda.remover(ent.nextInt());
				break;
			case 5:
				System.out.print("----\nDigite o nome do contato >>> ");
				agenda.pesquisarNome(ent.nextLine());
				break;
			case 6:
				System.out.print("----\nDigite o telefone do contato >>> ");
				agenda.pesquisarTelefone(ent.nextLine());
				break;
			case 7:
				System.out.println("----\nEncerrando ...");
				System.exit(1);
			default:
				System.out.println("Opção inválida!");
				break;
			}
		}
	}

}
