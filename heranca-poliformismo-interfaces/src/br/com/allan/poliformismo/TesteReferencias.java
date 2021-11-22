package br.com.allan.poliformismo;

public class TesteReferencias {
	
	public static void main(String[] args) {
		Gerente g1 = new Gerente("joao", "12345678900",5250.00);
		
		ControleBonificacao con = new ControleBonificacao();
		con.registra(g1);
		System.out.println(con.getSoma());
				
		EditorVideo editor = new EditorVideo("ze", "12345678900", 2500.00);
		
		con.registra(editor);
		System.out.println(con.getSoma());
		
		Designer designer = new Designer("ana", "123456779900", 2000.00);
		
		con.registra(designer);
		System.out.println(con.getSoma());
		
	}
	

}
