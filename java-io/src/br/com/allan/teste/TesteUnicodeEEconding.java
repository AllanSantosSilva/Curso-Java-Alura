package br.com.allan.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class TesteUnicodeEEconding {

	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String s = "C";
		System.out.println(s.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		
		System.out.println(charset.displayName());
		
		byte[] bytes = s.getBytes("UTF-8");
		System.out.println(bytes.length + " ,\"UTF-8\"");
	}
}
