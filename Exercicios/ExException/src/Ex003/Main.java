package Ex003;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();

		System.out.println("Digite seu nome:");
		pessoa.setNome(ent.nextLine());

		boolean ver = false;
		while (ver == false) {
			try {
				System.out.println("-----------------------");
				System.out.println("Digite sua idade:");
				pessoa.setIdade(ent.nextInt());
				ver = true;
			} catch (IdadeException e) {
				System.out.println("Erro: " + e.getMessage());
				ver = false;
			}
		}
		
		System.out.println("-----------------------\nNome: "+pessoa.getNome()+"\nIdade: "+pessoa.getIdade());
	}
}
