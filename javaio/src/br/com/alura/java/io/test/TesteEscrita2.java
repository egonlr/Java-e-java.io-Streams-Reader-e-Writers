package br.com.alura.java.io.test;

import java.io.*;

public class TesteEscrita2 {

	public static void main(String[] args) throws IOException {
		//Fluxo de Entrada com Arquivo
		
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		FileWriter fw = new FileWriter("lorem2.txt");
		//BufferedWriter bw = new BufferedWriter(fw);
		
		fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
		fw.write(System.lineSeparator());
		fw.write(System.lineSeparator());
		fw.write("id est laborum.");
		
		fw.close();
		
//		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
//		bw.newLine();
//		bw.newLine();
//		bw.write("id est laborum.");
//		
//		bw.close();

	}

}
