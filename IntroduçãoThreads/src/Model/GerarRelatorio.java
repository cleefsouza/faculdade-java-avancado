package Model;

/**
 * 
 * @author cleefsouza
 *
 */
public class GerarRelatorio implements Runnable {

	@Override
	public void run() {
		System.err.println("inicio do relatório");
		for (int i = 0; i <= 10; i++) {
			System.out.println("relatório: " + i);
		}
		System.err.println("fim do relatório");
	}
}