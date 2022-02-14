package br.com.allan.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
//		String nome = " allan";
//		ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//		
//		oss.writeObject(nome);
//		oss.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String nome = (String) ois.readObject();
		System.out.println(nome);
		ois.close();
	}

}
