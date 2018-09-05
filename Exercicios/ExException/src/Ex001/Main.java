package Ex001;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		Utils utils = new Utils();

		try {
			double conversao = utils.toCelsius(ent.nextDouble());
			System.out.println("Resultado: " + conversao + " C");
		} catch (TemperaturaException ex) {
			System.out.println("Error: " + ex.getMessage()); // Exibe a mensagem recebida pela superclasse
		}
	}
}
