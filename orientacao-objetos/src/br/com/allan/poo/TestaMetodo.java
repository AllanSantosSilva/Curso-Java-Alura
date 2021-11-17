package br.com.allan.poo;

public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		Conta conta1 = new Conta();
		
		conta.saldo = 1000;
		conta.deposita(1000);
		System.out.println(conta.saldo);
		conta.sacar(150);
		System.out.println(conta.saldo);
		
		conta.transfere(conta1, 150);
		System.out.println(conta1.saldo);
				
	}

}
