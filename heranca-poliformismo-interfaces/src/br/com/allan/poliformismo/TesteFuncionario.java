package br.com.allan.poliformismo;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		Funcionario fun = new Gerente("allan","12345678900",1500.00); 
		
		System.out.println(fun.getBonificacao());
	}
}
