package br.com.allan.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {
	
	public static void main(String[] args) throws IOException {
		
		InputStream fis = new FileInputStream("texto-teste-java2.txt");
		Reader irs = new InputStreamReader(fis,"UTF-8");
		BufferedReader br = new BufferedReader(irs);
		String linha = br.readLine();
		
		while(linha!= null) {
			
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();
	}

}
