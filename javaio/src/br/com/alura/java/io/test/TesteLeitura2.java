package br.com.alura.java.io.test;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(new File("contas.csv"));
		
	while(sc.hasNextLine()) {
		
		String linha = sc.nextLine();
		System.out.println(linha);
		
		Scanner linhasc = new Scanner(linha);
		linhasc.useLocale(Locale.US);
		linhasc.useDelimiter(",");
		
		String valor1 = linhasc.next();
		int valor2 = linhasc.nextInt();
		int valor3 = linhasc.nextInt();
		String valor4 = linhasc.next();
		double valor5 = linhasc.nextDouble();
		
		System.out.println(valor1 + valor2 + valor3 + valor4 + valor5);
		linhasc.close();
		//String [] valores = linha.split(",");
		//System.out.println(Arrays.toString(valores));
		//System.out.println(valores[3]);
		
	}

	sc.close();
	
	}
}
