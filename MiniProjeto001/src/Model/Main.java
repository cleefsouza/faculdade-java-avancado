package Model;

import java.util.Scanner;

import Control.ContaNullException;

/**
 * @author cleefsouza
 *
 */

public class Main {
	static Scanner ent;

	public static void main(String[] args) {
		Endereco endereco = new Endereco("Amazing Grace", "58302-000", "Throwable", "256b", "Hole Java");
		Agencia agencia = new Agencia("1234-5", endereco);
		
		/*
		 * Setando pessoa padrão para todas as contas.
		 * Tipo: PessoaFisica()
		 */
		PessoaFisica pessoa = new PessoaFisica("Aryosvalldo Cleef de Souza", 5000, 1, endereco, "111.222.333-44","1.234.567");

		Conta conta;

		while (true) {
			System.out.print(
					"---------------------------------\nMini Projeto 001 - Caixa de Banco\nAluno - Aryosvalldo Cleef de Souza\n---------------------------------\nGerenciamento de Contas\n---------------------------------\n1 - Cadastrar Conta\n2 - Listar Contas\n3 - Acessar uma Conta\n4 - Sair\n>>> ");

			ent = new Scanner(System.in); // Zerando objeto Scanner
			String opc = ent.nextLine();

			switch (opc) {
			case "1":
				System.out.print("Número da conta >>> ");
				String numeroConta = ent.next(); // Ex: 12345-6

				System.out.print("Senha da conta >>> ");
				String senha = ent.next(); // Ex: abc123

				System.out.print("Saldo atual >>> ");
				double saldo = ent.nextDouble(); // Ex: 1200.0

				conta = new Conta(numeroConta, senha, saldo, agencia, pessoa); // Criando conta
				try {
					// Cadastrando conta na agência
					agencia.cadastrarConta(conta);
				} catch (ContaNullException cne) {
					System.err.println("Erro: " + cne.getMessage());
				}
				break;

			case "2":
				agencia.listarContas(); // Listando contas
				break;

			case "3":
				System.out.print("Número da conta >>> ");
				agencia.acessarConta(ent.next()); // Acessando uma conta
				break;

			case "4":
				System.out.println(">>> Obrigado por utilizar o Unipê Bank!\n>>> Encerrando ...");
				System.exit(1);
				break;

			default:
				System.out.println(">>> Opção inválida!");
				break;
			}
		}
	}
}
