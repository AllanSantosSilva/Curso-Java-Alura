package br.com.allan.poo;

public class TesteReferencia {
	
	public static void main(String[] args) {
		 Conta conta = new Conta();
		 
		 conta.saldo = 300;
		 
		 System.out.println("saldo:" + conta.saldo);
		 
		 Conta conta1 = conta;
		 
		 System.out.println("saldo:" + conta.saldo);
		 
		 if (conta == conta1) {
			System.out.println("s�o a mesma conta");
		}else {
			System.out.println("nao s�o mesma conta");
		}
		 
		 System.out.println(conta);
	}

}
