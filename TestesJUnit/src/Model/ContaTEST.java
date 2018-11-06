package Model;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * @author cleefsouza
 *
 */

public class ContaTEST {

	/*
	 * Métodos de Teste
	 */

	@Test(expected = IllegalArgumentException.class)
	public void saldoValorNegativo() throws SaldoInsuficienteException {
		// Cenário de teste
		Conta conta = new Conta("123-4", 100);

		// Realizando ação
		conta.sacar(-50);
	}

	@Test(expected = SaldoInsuficienteException.class)
	public void saldoValorInsuficiente() throws SaldoInsuficienteException {
		// Cenário de teste
		Conta conta = new Conta("123-4", 100);

		// Realizando ação
		conta.sacar(200);
	}

	@Test
	public void realizandoSaque() throws SaldoInsuficienteException {
		// Cenário de teste
		Conta conta = new Conta("123-4", 100);

		// Realizando ação
		conta.sacar(50);
		Assert.assertEquals(50, conta.getSaldo(), 0.00001);
	}

	@Test(expected = DepositoNegativoException.class)
	public void depositoNegativo() throws DepositoNegativoException {
		// Cenário de teste
		Conta conta = new Conta("123-4", 100);

		// Realizando ação
		conta.depositar(-1);
	}
}