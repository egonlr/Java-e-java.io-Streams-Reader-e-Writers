package br.com.alura.java.io.test;

import java.io.*;

public class TesteEscrita3 {

	public static void main(String[] args) throws IOException {
		//Fluxo de Entrada com Arquivo
		
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		//PrintStream ps = new PrintStream("lorem2.txt");  // ou
		
		PrintWriter ps = new PrintWriter("lorem2.txt");
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.println();
		ps.println();
		ps.println();
		ps.print("id est laborum.");
		
		ps.close();

	}

}
