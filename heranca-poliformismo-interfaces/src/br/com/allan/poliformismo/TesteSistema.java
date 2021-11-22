package br.com.allan.poliformismo;

public class TesteSistema {
	
	public static void main(String[] args) {
		Gerente g = new Gerente("allan","12345678900", 2500.00);
		g.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		
		Admin adm = new Admin("ze","12345678900",2300);
		si.autentica(adm);
	}

}
