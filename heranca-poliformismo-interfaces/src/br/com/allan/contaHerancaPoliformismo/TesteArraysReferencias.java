package br.com.allan.contaHerancaPoliformismo;

public class TesteArraysReferencias {
	
	public static void main(String[] args) {
		
		Conta[] contas = new ContaCorrente[6];
		
		ContaCorrente cc = new ContaCorrente(321, 123);
		ContaCorrente cc1 = new ContaCorrente(321, 547);
		ContaCorrente cc2 = new ContaCorrente(321, 943);
		ContaCorrente cc3 = new ContaCorrente(321, 279);
		ContaCorrente cc4 = new ContaCorrente(321, 618);
		//ContaPoupanca cp1 = new ContaPoupanca(549, 945);
		
		contas [0] = cc;
		contas [1] = cc1;
		contas [2] = cc2;
		contas [3] = cc3;
		contas [4] = cc4;
		//contas [5] = cp1;
		
		
		System.out.println(contas[0].getNumero());
		
		Conta ref = contas[1];
		
		System.out.println(ref.getNumero());
	}

}
