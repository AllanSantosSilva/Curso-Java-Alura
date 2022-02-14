package br.com.allan.teste;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraScanner {
	
	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("contas.csv"),"UTF-8");
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String valor = linhaScanner.next();
			int valor1 = linhaScanner.nextInt();
			int valor2 = linhaScanner.nextInt();
			String valor3 = linhaScanner.next();
			double valor4 = linhaScanner.nextDouble();
			
			String valorFormatado = String.format("%s - %s- %s, %s: %s", valor,valor1,valor2,valor3,valor4);
			System.out.println(valorFormatado);
			
//			String[] valores = linha.split(",");
//			System.out.println(valores[3]);
		}
		scanner.close();
	}

}
