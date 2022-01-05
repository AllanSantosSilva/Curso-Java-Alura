package br.com.allan.contaHerancaPoliformismo;

public class TesteSaca {

	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(123,321);
		c.deposita(200);
		try {
			c.sacar(210); // erro
		} catch (Exception e) {
			System.out.println("EX:"+ e.getMessage());
		}
		
		System.out.println(c.getSaldo());
	}
}
