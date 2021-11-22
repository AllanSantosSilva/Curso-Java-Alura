package br.com.allan.contaHerancaPoliformismo;

public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	
	public Conta(int agencia,int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
	}

	public static int getTotal() {
		return total;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		if(agencia <=0) {
			System.out.println("agencia nao pode valor menor igual a zero");
		}
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public abstract void deposita(double valor);

	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;

	}

	public boolean transfere(Conta contaDestino, double valor) {
		if (this.sacar(valor)) {
			contaDestino.deposita(valor);
			return true;
		}
		return false;

	}
}
