package br.com.allan.poo;

public class TestaSacaValorNegativo {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.deposita(100);
		//System.out.println(conta.sacar(101));
		//System.out.println(conta.getSaldo());
		
		//conta.setSaldo(-100);
		//System.out.println(conta.getSaldo());
		
		Cliente cliente = new Cliente();
		cliente.setNome("allan");
		cliente.setCpf("12345678900");
		cliente.setProfissao("programador");
		conta.setTitular(cliente);
		System.out.println(conta.getTitular().getNome() +"-"+ conta.getTitular().getCpf() +"-"+ conta.getTitular().getProfissao());
		
	}

}
