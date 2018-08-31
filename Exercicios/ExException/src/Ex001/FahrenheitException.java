package Ex001;

public class FahrenheitException extends TemperaturaException {

	// Construtor
	public FahrenheitException(String msg) {
		super(msg); // Envia a mensagem recebida para a superclasse
		System.out.println("Passando pelo construtor de FahEx");
	}
}
