package Model;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		ArrayList<Carro> arraylist = new ArrayList<>();

		// Carro 01
		Motor m1 = new Motor(3000, 2, "Ford");
		Banco b1 = new Banco(1000, "Couro x2", "Pure Couro");
		Pneu p1 = new Pneu(3000, 17, "Pirelli");
		Carro c1 = new Carro("Ford K", "Ford", m1, b1, p1);
		arraylist.add(c1);

		// Carro 02
		Motor m2 = new Motor(2500, 1, "FIAT");
		Banco b2 = new Banco(500, "Couro x1", "Pure Couro");
		Pneu p2 = new Pneu(2000, 15, "Pirelli");
		Carro c2 = new Carro("Uno", "FIAT", m2, b2, p2);
		arraylist.add(c2);

		// Carro 03
		Motor m3 = new Motor(8000, 3, "BMW");
		Banco b3 = new Banco(1500, "Couro x5", "Pure Couro");
		Pneu p3 = new Pneu(3000, 18, "Pirelli");
		Carro c3 = new Carro("BMW S5", "BMW", m3, b3, p3);
		arraylist.add(c3);

		for (Carro c : arraylist) {
			System.out.println("# FÁBRICA DE CARROS #\n" + "# Modelo: " + c.modelo + "\n" + "# Fabricante: " + c.fabricante
					+ "\n" + "# Preço: " + c.precoCarro()+"\n"
							+ "--------------------------");
		}

	}
}
