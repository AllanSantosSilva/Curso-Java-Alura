package br.com.allan.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteEscritaPeloTeclado {
	
	public static void main(String[] args) throws IOException {
		
		InputStream fis = System.in;
		Reader irs = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(irs);
		String linha = br.readLine();
		
		OutputStream fos = new FileOutputStream("texto-teste-java4.txt");
		Writer ows = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(ows);
		
		while(linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			linha = br.readLine();
		}
		System.out.println("texto escrito com sucesso");
		
		br.close();
		bw.close();
	}
	

}
