package Model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import Control.ContaDuplicadaException;
import Control.ContaNullException;

/**
 * @author cleefsouza
 *
 */

public class Agencia {
	private String numero; // Ex: 1234-5
	private Endereco endereco; // Ex: Objeto do tipo Endereco
	private ArrayList<Conta> contas = new ArrayList<>(); // Ex: Objetos do tipo Conta

	// Construtor
	public Agencia() {

	}

	public Agencia(String num, Endereco end) {
		this.numero = num;
		this.endereco = end;
	}

	/*
	 * Métodos
	 */

	public void cadastrarConta(Conta c) throws ContaNullException, ContaDuplicadaException {
		// Tratando exceção
		if (contas.isEmpty() == true) {
			if (c == null) {
				throw new ContaNullException("Valores nulos recebidos! A conta não pode ser cadastrada.");
			} else {
				this.contas.add(c);
				System.out.println(">>> Conta cadastrada com sucesso!");
			}
		} else {
			Conta cAux = buscarConta(c.getNumeroConta());
			if (cAux == null) {
				this.contas.add(c);
				System.out.println(">>> Conta cadastrada com sucesso!");
			} else {
				throw new ContaDuplicadaException("Já existe uma conta cadastrada com esse número!");
			}
		}
	}

	public void listarContas() {
		if (contas.isEmpty() == false) {
			SimpleDateFormat fData = new SimpleDateFormat("dd/MM/yyyy"); // Formatador de data
			System.out.println("---------------------------------\nLista de Contas");
			for (Conta c : contas) {
				System.out.println("---------------------------------\nCliente >> " + c.getPessoa().getNome()
						+ "\nNúmero da Conta >>> " + c.getNumeroConta() + "\nData de Abertura >>> "
						+ fData.format(c.getDataAbertura()) + "\nSituação da Conta >>> "
						+ (c.getSituacaoConta() == 1 ? "Ativa" : "Inativa"));
			}
		} else {
			System.err.println("Nenhuma conta cadastrada!");
		}
	}

	public void acessarConta(String num) {
		if (contas.isEmpty()) {
			System.err.println("Nenhuma conta cadastrada!");
		} else {
			Conta contaAux = null; // Conta para retorno
			for (Conta c : contas) { // Verificando arraylist
				if (num.equals(c.getNumeroConta())) {
					contaAux = c; // Recebendo conta valida
					break;
				}
			}

			if (contaAux == null) {
				System.err.println("Conta não encontrada!");
			} else {
				contaAux.realizarOperacoes(contaAux, contaAux.getAgencia()); // Acessando menu da conta
			}
		}
	}

	public Conta buscarConta(String num) {
		Conta contaAux = null;
		for (Conta c : contas) { // Verificando arraylist
			if (num.equals(c.getNumeroConta())) {
				contaAux = c; // Recebendo conta valida
				break;
			}
		}
		return contaAux; // Retorno padr�o
	}

	/*
	 * Getters e Setters
	 */

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public ArrayList<Conta> getContas() {
		return contas;
	}

	public void setContas(ArrayList<Conta> contas) {
		this.contas = contas;
	}
}
