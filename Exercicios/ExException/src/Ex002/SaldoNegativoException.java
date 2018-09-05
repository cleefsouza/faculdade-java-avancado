package Ex002;

public class SaldoNegativoException extends Exception{
	// Construtor
	public SaldoNegativoException(String msg){
		super(msg);  // Envia a mensagem recebida para a superclasses
		System.out.println("Passando por saldo negativo exception!");
	}
}
