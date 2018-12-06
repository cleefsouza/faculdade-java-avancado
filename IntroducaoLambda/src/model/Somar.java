package model;

import controller.ISomar;

/**
 *
 * @author cleefsouza
 */
public class Somar implements ISomar {

	@Override
	public void somar(int a, int b) {
		System.out.println("Resultado: " + (a + b));
	}

}