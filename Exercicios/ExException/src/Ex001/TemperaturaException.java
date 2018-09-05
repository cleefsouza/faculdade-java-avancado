package Ex001;

public class TemperaturaException extends Exception {
	// Construtor
	public TemperaturaException(String msg) {
		super(msg); // Envia a mensagem recebida para a superclasses
		System.out.println("Passando pelo construtor de TemEx");
	}
}
