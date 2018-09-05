package Ex002;

public class ValorException extends Exception{
	// Construtor
	public ValorException(String msg){
		super(msg); // Envia a mensagem recebida para a superclasses
		System.out.println("Passando por valor exception!");
	}
}
