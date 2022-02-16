package br.com.alura.java.io.test;

import java.io.*;
import java.net.Socket;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
		//Fluxo de Entrada com Arquivo
		
		Socket s = new Socket();  
		
		InputStream fis = s.getInputStream();  //Leitura pela rede
		
		//InputStream fis = System.in; // Leitura via teclado
		//InputStream fis = new FileInputStream("lorem.txt");  //Leitura no arquivo
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream fos = s.getOutputStream(); //Saída pela rede
		
		//OutputStream fos = System.out; //Saída no Console
		//OutputStream fos = new FileOutputStream("lorem2.txt"); //Saída no arquivo
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		
		while(linha != null && !linha.isEmpty()) {
			
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}

		
		br.close();
		bw.close();

	}

}
