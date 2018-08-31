package Ex001;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		Utils utils = new Utils();
		
		try{
			double conversao = utils.toCelsius(ent.nextDouble());
			if(conversao < -459.67){
				throw new FahrenheitException("Resultado menor que zero absoluto!"); // Recebe a mensagem que será enviada para a superclasse
			}else{
				System.out.println("Resultado: "+conversao+" C");
			}
		}catch(TemperaturaException ex){
			System.out.println("Error: "+ex.getMessage()); // Exibe a mensagem recebida pela superclasse
		}
	}
}
