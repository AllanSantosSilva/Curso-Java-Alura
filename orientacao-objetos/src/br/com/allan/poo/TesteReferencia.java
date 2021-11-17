package br.com.allan.poo;

public class TesteReferencia {
	
	public static void main(String[] args) {
		 Conta conta = new Conta();
		 
		 conta.saldo = 300;
		 
		 System.out.println("saldo:" + conta.saldo);
		 
		 Conta conta1 = conta;
		 
		 System.out.println("saldo:" + conta.saldo);
		 
		 if (conta == conta1) {
			System.out.println("são a mesma conta");
		}else {
			System.out.println("nao são mesma conta");
		}
		 
		 System.out.println(conta);
	}

}
