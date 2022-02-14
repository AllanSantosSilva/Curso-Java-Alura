package br.com.allan.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarArquivo {
	
public static void main(String[] args) throws IOException {
		
		InputStream fis = new FileInputStream("texto-teste-java2.txt");
		Reader irs = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(irs);
		String linha = br.readLine();
		
		OutputStream fos = new FileOutputStream("texto-teste-java3.txt");
		Writer ows = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(ows);
		
		while(linha != null) {
			bw.write(linha);
			bw.newLine();
			linha = br.readLine();
		}
		System.out.println("texto copiado");
		
		br.close();
		bw.close();
	}


}
