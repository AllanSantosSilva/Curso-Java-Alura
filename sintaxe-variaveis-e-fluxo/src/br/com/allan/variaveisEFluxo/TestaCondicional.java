package br.com.allan.variaveisEFluxo;

public class TestaCondicional {
	
	public static void main(String[] args) {
		
		System.out.println("testando condicionais");
		
		int idade = 16;
		//int idade = 20;
		
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("idade maior que 18");
			System.out.println("o valor da idade é: " + idade);
		}else {
			if (quantidadePessoas >= 2) {
				System.out.println("voce nao e maior de 18 mais pode entrar pois esta acompanhado com mais de 2 pessoas,"
						+ "sua quantidade de pessoas é: " + quantidadePessoas);
			}
			System.out.println("idade menor que 18 anos ");
			System.out.println("o valor da idade é: " + idade);
			
		}
	}
}
