package Model;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author cleefsouza
 *
 */

public class Conta {
	private String numeroConta; // Ex: 12345-6
	private Date dataAbertura; // Ex: 01/01/1001
	private Date dataEncerramento; // Ex: 01/01/1001
	private int situacaoConta = 1; // Ex: 1 - ativa, 0 - inativa
	private String senha; // Ex: abc123
	private double saldo; // Ex: 1500.0
	private Agencia agencia; // Objeto do tipo Agencia
	private Pessoa pessoa; // Objeto do tipo Pessoa
	private ArrayList<Movimento> movimentos = new ArrayList<>(); // Objeto do tipo Movimento

	// Construtor
	public Conta() {

	}

	public Conta(String num, String sen, double sal, Agencia age, Pessoa pes) {
		this.numeroConta = num;
		this.dataAbertura = new Date(System.currentTimeMillis());
		this.senha = sen;
		this.saldo = sal;
		this.agencia = age;
		this.setPessoa(pes);
	}

	/*
	 * Métodos
	 */

	public void sacar(double valor) {
		if (this.getSaldo() <= 0 || valor <= 0) {
			System.err.println("Imposível realizar saque! Saldo ou valor menor ou igual a zero.");
		} else {
			this.setSaldo(this.getSaldo() - valor);
			atualizarConta(agencia.buscarConta(this.numeroConta)); // Atualiza conta
			System.out.println("Saque realizado com sucesso!");

			// Registrando movimentação
			registrarMovimentacao(1, valor);
		}
	}

	public void depositar(double valor) {
		if (valor <= 0) {
			System.err.println("Imposível realizar depósito! Valor menor ou igual a zero.");
		} else {
			this.setSaldo(this.getSaldo() + valor);
			atualizarConta(agencia.buscarConta(this.numeroConta)); // Atualiza conta
			System.out.println("Depósito realizado com sucesso!");

			// Registrando movimentação
			registrarMovimentacao(2, valor);
		}
	}

	public void transferirValor(double valor, String num) {
		Conta receber = this.agencia.buscarConta(num); // Conta que vai receber o valor
		if (receber == null) {
			System.err.println("Conta não encontrada! Por favor, tente novamente.");
		} else {
			// Verifica se o saldo é positivo
			if (this.saldo <= 0 || this.saldo < valor) {
				System.err.println("Transferêcia não realizada! Saldo menor que o valor, negativo ou igual a zero.");
			} else {
				this.saldo = this.saldo - valor; // Subtrai o valor da conta emissora
				receber.setSaldo(receber.getSaldo() + valor); // Adiciona o valor na conta receptora

				// Atualizar contas
				atualizarConta(agencia.buscarConta(this.numeroConta));
				atualizarConta(receber);

				// Registrando movimentação
				registrarMovimentacao(3, valor);

				System.out.println(">>> Transferência realizada com sucesso!");
			}
		}
	}

	public void registrarMovimentacao(int tipo, double valor) {
		Movimento mov = new Movimento();

		mov.setDataMovimentacao(new Date(System.currentTimeMillis()));
		mov.setHoraMovimentacao(new Timestamp(System.currentTimeMillis()));
		mov.setTipo(tipo);
		mov.setValorMovimentacao(valor);

		this.movimentos.add(mov); // Adicionando movimentação ao array
	}

	public void listarMovimentacoes() {
		if (movimentos.isEmpty() == false) {
			SimpleDateFormat fData = new SimpleDateFormat("dd/MM/yyyy"); // Formatador de data
			SimpleDateFormat fHora = new SimpleDateFormat("HH:mm"); // Formatador de data
			String tipo = "";

			System.out.println("---------------------------------\nHistórico de Movimentação");
			for (Movimento m : movimentos) {
				
				if (m.getTipo() == 1) {
					tipo = "Saque";
				} else if (m.getTipo() == 2) {
					tipo = "Depósito";
				} else {
					tipo = "Transferência";
				}
				
				// Listando movimentações
				System.out.println("---------------------------------\nTipo >>> " + tipo + "\nValor >>> R$ "
						+ m.getValorMovimentacao() + "\nData da Operação >>> " + fData.format(m.getDataMovimentacao())
						+ "\nHora da Operação >>> " + fHora.format(m.getHoraMovimentacao()));
			}
		} else {
			System.err.println("Nenhuma conta cadastrada!");
		}
	}

	public void atualizarConta(Conta c) {
		this.agencia.getContas().set(this.agencia.getContas().indexOf(c), c); // Atualiza conta
	}

	public void realizarOperacoes(Conta c, Agencia a) {
		Scanner ent;

		boolean ver = true;
		while (ver == true) {
			System.out.print("---------------------------------\nCliente: " + c.pessoa.getNome() + "\nConta Nº: " + c.getNumeroConta() + " / Agência: " + a.getNumero()
					+ " / Saldo atual: R$ " + c.getSaldo()
					+ "\n---------------------------------\n1 – Realizar Saque\n2 – Realizar Depósito\n3 - Realizar Transferência\n4 - Extrato Bancário\n5 - Sair\n>>> ");

			ent = new Scanner(System.in);
			String opc = ent.next();

			switch (opc) {
			case "1":
				System.out.print("Valor do saque >>> ");
				sacar(ent.nextDouble());
				break;

			case "2":
				System.out.print("Valor do depósito >>> ");
				depositar(ent.nextDouble());
				break;

			case "3":
				System.out.print("Número da conta para transferência >>> ");
				String contaTrans = ent.next();

				System.out.print("Valor para transferência >>> ");
				double valorTrans = ent.nextDouble();

				transferirValor(valorTrans, contaTrans); // Operação de transferência
				break;

			case "4":
				listarMovimentacoes();
				break;

			case "5":
				System.out.println(">>> Encerrando sessão ...");
				ver = false;
				break;

			default:
				System.out.println(">>> Opção inválida!");
				break;
			}
		}
	}

	/*
	 * Getters e Setters
	 */

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public Date getDataEncerramento() {
		return dataEncerramento;
	}

	public void setDataEncerramento(Date dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}

	public int getSituacaoConta() {
		return situacaoConta;
	}

	public void setSituacaoConta(int situacaoConta) {
		this.situacaoConta = situacaoConta;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public ArrayList<Movimento> getMovimentos() {
		return movimentos;
	}

	public void setMovimentos(ArrayList<Movimento> movimentos) {
		this.movimentos = movimentos;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
