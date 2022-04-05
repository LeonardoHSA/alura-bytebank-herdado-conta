package br.com.bytebanck.banco.teste;

import javax.print.attribute.SetOfIntegerSyntax;

public class TesteString {

	public static void main(String[] args) {
		
		String vazio = "    Alura ";
		String outroVazio = vazio.trim(); // O método trim() retira os epaços vazios da string
		
		System.out.println(vazio.contains("Alu"));
		System.out.println(outroVazio);
		
		String nome = "Alura"; // object literal
		//String outro = new String("Alura"); - Também pode-se cria um objeto da classe String desta forma, porém é uma má prática.
		
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
//		String sub = nome.substring(1);
//		System.out.println(sub);
		
//		int pos = nome.indexOf("u");
//		System.out.println(pos);
		
//		char c = nome.charAt(2);
//		System.out.println(c);
		
//		char c = 'A';
//		char d = 'a';
//		String outra = nome.replace(c, d);
		
		//String outra = nome.toUpperCase();
		
//		System.out.println(nome);
//		System.out.println(outra);
		
	}

}
