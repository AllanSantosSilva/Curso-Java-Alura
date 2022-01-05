package br.com.excecoes;

public class PilhaFluxoComTratamento {

	public static void main(String[] args) {
		System.out.println("inicio do main");
		try {
			metodo1();
		} catch (Exception  e) {
			String msg = e.getMessage();
			System.out.println("Exception " + msg);
			e.printStackTrace();
		}
		System.out.println("fim do main");
	}

	private static void metodo1() throws MinhaExcecao {
		System.out.println("ini do metodo1");
		metodo2();
		System.out.println("fim do metodo1");
	}

	private static void metodo2() throws MinhaExcecao {
		System.out.println("ini do metodo2");
		
		throw new MinhaExcecao("deu muito errado");
		//System.out.println("fim do metodo2");
	}

}
