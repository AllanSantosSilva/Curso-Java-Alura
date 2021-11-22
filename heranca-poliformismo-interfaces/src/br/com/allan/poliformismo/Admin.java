package br.com.allan.poliformismo;

public class Admin extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;
	
	public Admin(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public double getBonificacao() {
		return 50;
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
		
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

}
