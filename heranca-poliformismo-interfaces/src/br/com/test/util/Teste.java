package br.com.test.util;

import java.util.ArrayList;
import java.util.List;


public class Teste {
	
	public static void main(String[] args) {
		
		// conceito de wrappers
		
		List<Number> lista = new ArrayList<>();
		lista.add(30);
		lista.add(62.1); // aceita diversos formatos de numeros pois esta usando a classe mais generica number
		
		List<Integer> numeros = new ArrayList<>();
		numeros.add(29); // autoboxing
		
		
		Integer idadeRef = Integer.valueOf(29);
		int valor = idadeRef.intValue();
		
		int valor1 = idadeRef.intValue(); // unboxing
		
		System.out.println(valor);
	}

}
