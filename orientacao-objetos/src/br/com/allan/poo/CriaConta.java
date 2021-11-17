package br.com.allan.poo;

public class CriaConta {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.titular = "allan";
		conta.numero = 001;
		conta.agencia = 1254;
		conta.saldo = 2457.06;
		conta.saldo += 100;
		
		Conta conta1 = new Conta();
		conta1.titular = "sonia";
		conta1.numero = 001;
		conta1.agencia = 1255;
		conta1.saldo = 2457.06;
		
		
		System.out.println(conta.titular);
		System.out.println(conta.numero);
		System.out.println(conta.agencia);
		System.out.println(conta.saldo);
		
		
		System.out.println(conta1.titular);
		System.out.println(conta1.numero);
		System.out.println(conta1.agencia);
		System.out.println(conta1.saldo);
	}
}
