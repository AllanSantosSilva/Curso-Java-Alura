package br.com.allan.poliformismo;

public class TesteGerente {
	
	public static void main(String[] args) {
		
		Gerente gen = new Gerente("joana","123456789000",5000.00);
		System.out.println(gen.getNome());
		System.out.println(gen.getBonificacao());
		
		gen.setSenha(22222);
		
		boolean autenticou = gen.autentica(22222);
		
		System.out.println(autenticou);
		
	}

}
