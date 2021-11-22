package br.com.allan.poliformismo;

public class SistemaInterno {
	private int senha = 2222;
	
	public void autentica(Autenticavel fun) {
		boolean autenticou = fun.autentica(senha);
		if(autenticou) {
			System.out.println("acesso permitido");
		}else {
			System.out.println("acesso negado");
		}
	}
}
