package br.com.allan.variaveisEFluxo;

public class TestaCondicionais2 {
	public static void main(String[] args) {

		System.out.println("testando condicionais");

		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >=2;

		if (idade >= 18 && acompanhado) {				//..... ||....... && condicionais geralmente usados
			System.out.println("voce pode entrar ");
		} else {
			System.out.println("voce nao pode entrar ");

		}
		
	}
}
