package Model;

/**
 * 
 * @author cleefsouza
 *
 */
public class CestaDeFrutas implements Runnable {

	String[] frustas = { "banana", "maçã", "laranja", "abacate", "maracujá" };

	@Override
	public void run() {
		System.err.println("inicio da cesta");

		for (String f : this.frustas) {
			System.out.println("fruta da cesta: " + f);

			try {
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.err.println("fim da cesta");
	}
}