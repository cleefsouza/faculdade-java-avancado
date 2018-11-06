package Model;

/**
 * 
 * @author cleefsouza
 *
 */
public class Main {

	public static void main(String[] args) {
		System.err.println("inicio do main");
		
		GerarRelatorio gr = new GerarRelatorio(); // Tarefa 01
		BarraDeProgresso bp = new BarraDeProgresso(); // Tarefa 02
		CestaDeFrutas cf = new CestaDeFrutas(); // Tarefa 03

		Thread thread1 = new Thread(gr); // Thread recebe tarefa 01
		Thread thread2 = new Thread(bp); // Thread recebe tarefa 02
		Thread thread3 = new Thread(cf); // Thread recebe tarefa 03

		// Simulando paralelismo
		thread3.start(); // Iniciando novo fluxo de execução
		thread1.start(); // Iniciando novo fluxo de execução
		thread2.start(); // Iniciando novo fluxo de execução
		for (int i = 0; i <= 10; i++) { // Método main
			System.out.println("main: " + i);
		}
		
		System.err.println("fim do main");
	}
}