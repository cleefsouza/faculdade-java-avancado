package Ex002;

import java.util.Scanner;

/**
 * @author cleefsouza
 *
 */

public class Main {
	public static void main(String[] args) {
		Conta conta = new Conta("1234-5", 1000, 500);
		Scanner ent = new Scanner(System.in);

		System.out.println("Conta: " + conta.getNumero() + "\nSaldo atual: " + conta.obterSaldo());
		System.out.println("------------------------------");

		try {
			System.out.println("Realize um saque:");
			conta.sacar(ent.nextDouble());
		} catch (SaldoNegativoException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		System.out.println("------------------------------");

		try {
			System.out.println("Realize um depósito:");
			conta.depositar(ent.nextDouble());
		} catch (ValorException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
