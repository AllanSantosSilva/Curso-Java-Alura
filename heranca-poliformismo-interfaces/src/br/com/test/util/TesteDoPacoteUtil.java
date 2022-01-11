package br.com.test.util;

import java.util.ArrayList;
import br.com.allan.contaHerancaPoliformismo.Conta;
import br.com.allan.contaHerancaPoliformismo.ContaCorrente;

public class TesteDoPacoteUtil {
	
	public static void main(String[] args) {
		 ArrayList<Conta> lista = new ArrayList<>();
		 
			Conta cc = new ContaCorrente(321, 123);
			Conta cc1 = new ContaCorrente(321, 555);
			
			lista.add(cc);
			lista.add(cc1);
			
			System.out.println("tamanho " + lista.size());
//			lista.remove(1);
//			System.out.println("tamanho " + lista.size());
			
			for (int i = 0; i < lista.size(); i++) {
				Object oref = lista.get(i);
				System.out.println(oref); // precisa sobre escrever o toString 
			}
			
			for (Object conta : lista) { // foreach 
				System.out.println(conta);
			}
		
		 }

}
