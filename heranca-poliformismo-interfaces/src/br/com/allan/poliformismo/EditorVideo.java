package br.com.allan.poliformismo;

public class EditorVideo extends Funcionario {

	public EditorVideo(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	public double getBonificacao() {
		System.out.println("metodo da classe editor video");
		return + 150;
	}

}
