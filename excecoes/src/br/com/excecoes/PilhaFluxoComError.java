package br.com.excecoes;

public class PilhaFluxoComError {

	public static void main(String[] args) throws MinhaExcecao {
		System.out.println("inicio do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException  e) {
			String msg = e.getMessage();
			System.out.println("Exception " + msg);
			e.printStackTrace();
		}
		System.out.println("fim do main");
	}

	private static void metodo1() {
		System.out.println("ini do metodo1");
		metodo2();
		System.out.println("fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("ini do metodo2");
		metodo2(); // lançará um erro de memoria
		System.out.println("fim do metodo2");
	}

}
