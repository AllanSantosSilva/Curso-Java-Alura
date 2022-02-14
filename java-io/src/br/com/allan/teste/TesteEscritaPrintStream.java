package br.com.allan.teste;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStream {

	public static void main(String[] args) throws IOException {
		
//		OutputStream fos = new FileOutputStream("texto-teste-java.txt");
//		Writer ows = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(ows);
		
		PrintStream ps = new PrintStream(new File("texto-teste-com-PrintStream.txt"));
		
		ps.println("linha escrita atraves da classe TesteEscrita");
		ps.println("mais uma linha escrita atraves da classe TesteEscrita");
		ps.println("ultima linha escrita atraves da classe TesteEscrita");
		System.out.println("texto escrito com sucesso");
		
		ps.close();
	}
}
