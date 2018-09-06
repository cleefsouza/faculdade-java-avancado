package Model;

import java.util.Scanner;

/**
 * @author cleefsouza
 *
 */

public class Main {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		while (true) {
			System.out.print(
					"-----------------------\nGerenciamento de Contas\n-----------------------\n1 - Cadastrar Conta\n2 - Listar Contas\n3 - Acessar uma Conta\n4 - Sair\n>>> ");

			String opc = ent.nextLine();

			switch (opc) {
			case "1":
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				System.out.println(">>> Encerrando ...");
				System.exit(1);
				break;
			default:
				System.out.println(">>> Opção inválida!");
				break;
			}
		}
	}
}
