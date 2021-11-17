package br.com.allan.poo;

public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		System.out.println(conta.getSaldo());
		
		//conta.getTitular().nome = "marcela";
		//System.out.println(conta.getTitular().nome);// erro pois nao existe um cliente referencia e null 
	}

}
