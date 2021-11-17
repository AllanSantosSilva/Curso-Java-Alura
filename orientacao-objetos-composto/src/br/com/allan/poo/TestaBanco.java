package br.com.allan.poo;

public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente allan = new Cliente();
		
		//allan.nome = "allan";
		//allan.cpf = "12345678900";
		//allan.profissao = "programador";
		
		Conta ContaAllan = new Conta();
		ContaAllan.deposita(1000);
		
		ContaAllan.setTitular(allan);
		//System.out.println(ContaAllan.getTitular().nome);
	}

}
