package br.com.allan.poo;

public class TestaValores {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337,24567);
		
		
		System.out.println(conta.getAgencia());
		
		Conta conta1 = new Conta(1337,344567);
		Conta conta2 = new Conta(1337,24590);
		
		System.out.println(Conta.getTotal());
	}

}
