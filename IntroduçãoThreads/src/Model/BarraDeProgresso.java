package Model;

/**
 * 
 * @author cleefsouza
 *
 */
public class BarraDeProgresso implements Runnable {

	@Override
	public void run() {
		System.err.println("inicio da barra");
		for (int i = 0; i <= 10; i++) {
			System.out.println("barra de progresso: " + i * 10 + "%");
		}
		System.err.println("fim da barra");
	}
}