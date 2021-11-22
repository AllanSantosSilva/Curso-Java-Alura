package br.com.allan.poliformismo;

public class Designer extends Funcionario {

	public Designer(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	public double getBonificacao() {
		System.out.println("metodo da classe designer");
		return 200;
	}

}
