package br.com.allan.contaHerancaPoliformismo;

public class TesteGuardadorDeReferencia {
	
	public static void main(String[] args) {
		GuardadadorDeContas guardador = new GuardadadorDeContas();
		
		Conta cc = new ContaCorrente(321, 123);
		Conta cc1 = new ContaCorrente(321, 555);
		
		guardador.adciona(cc);
		guardador.adciona(cc1);
		
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(0);
		Conta ref1 = guardador.getReferencia(1);
		
		System.out.println(ref.getNumero());
		System.out.println(ref1.getNumero());
	}

}
