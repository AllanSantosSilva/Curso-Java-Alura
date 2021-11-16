package br.com.allan.variaveisEFluxo;

public class TestaEscopo {

	public static void main(String[] args) {

		System.out.println("testando condicionais");

		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado;

		if (idade >= 18 && quantidadePessoas >= 2) { 
			acompanhado = true;
			System.out.println("voce pode entrar ");
		} else {
			acompanhado = false;
			System.out.println("voce nao pode entrar ");

		}

	}
}
