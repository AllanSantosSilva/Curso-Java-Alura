package br.com.allan.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		OutputStream fos = new FileOutputStream("texto-teste-java.txt");
		Writer ows = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(ows);
		
		bw.write("linha escrita atraves da classe TesteEscrita");
		bw.newLine();
		bw.write("mais uma linha escrita atraves da classe TesteEscrita");
		bw.newLine();
		bw.write("ultima linha escrita atraves da classe TesteEscrita");
		System.out.println("texto escrito com sucesso");
		
		bw.close();
	}
}
