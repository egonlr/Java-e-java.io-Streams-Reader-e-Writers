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
		//System.out.println(linha);
		
		Scanner linhasc = new Scanner(linha);
		linhasc.useLocale(Locale.US);
		linhasc.useDelimiter(",");
		
		String tipoConta = linhasc.next();
		int agencia = linhasc.nextInt();
		int numero = linhasc.nextInt();
		String titular = linhasc.next();
		double saldo = linhasc.nextDouble();
		
		String valorFormatado = String.format(new Locale("pt", "BR"), "%s - %04d-%08d, %20s: %08.2f ", tipoConta, agencia, numero, titular, saldo);
		System.out.println(valorFormatado);
		linhasc.close();
		//String [] valores = linha.split(",");
		//System.out.println(Arrays.toString(valores));
		//System.out.println(valores[3]);
		
	}

	sc.close();
	
	}
}
