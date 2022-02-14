package br.com.allan.teste;

import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		
//		OutputStream fos = new FileOutputStream("texto-teste-java.txt");
//		Writer ows = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(ows);
		
		FileWriter fw = new FileWriter("texto-teste-com-filewrite.txt");
		
		fw.write("linha escrita atraves da classe TesteEscrita");
		fw.write(System.lineSeparator());
		fw.write("mais uma linha escrita atraves da classe TesteEscrita");
		fw.write(System.lineSeparator());
		fw.write("ultima linha escrita atraves da classe TesteEscrita");
		System.out.println("texto escrito com sucesso");
		
		fw.close();
	}
}
