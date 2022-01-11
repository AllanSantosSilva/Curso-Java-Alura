package br.com.test.util;

import java.util.ArrayList;

import br.com.allan.contaHerancaPoliformismo.Conta;
import br.com.allan.contaHerancaPoliformismo.ContaCorrente;

public class TesteArrayListEquals {
	
	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<>();
		
		Conta cc = new ContaCorrente(123,321);
		Conta cc1 = new ContaCorrente(123,321);
		
		lista .add(cc);
		lista.add(cc1);
		
		boolean existe = lista.contains(cc1);
		
		System.out.println("existe? " + existe);
		
		
//		for (Conta conta : lista) {
//			System.out.println(conta); // precisa sobre escrever toString 
//		}
		
	}

}
