package br.com.allan.contaHerancaPoliformismo;

import java.util.Iterator;

public class TesteArraysPrimitivo {
	
	public static void main(String[] args) {
		
		int[] idades = new int[5];
		
		idades [0] = 29;
		idades [1] = 39;
		idades [2] = 19;
		idades [3] = 69;
		idades [4] = 59;
		
		System.out.println(idades.length);
		
		for (int i = 0; i < idades.length; i++) {
			int idade = i*i;
			System.out.println(idade);
		}
	}

}
