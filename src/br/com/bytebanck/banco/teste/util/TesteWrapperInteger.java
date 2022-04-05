package br.com.bytebanck.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
	
	public static void main(String[] args) {
		
		
		int idade = 29; //Integer
		Integer idadeRef = Integer.valueOf(29); // Autoboxing
		System.out.println("Transformando o valor de um inteiro em um double: " + idadeRef.doubleValue());
		
		System.out.println("Até que valor um inteiro comsegue armazenar? " + Integer.MAX_VALUE);
		System.out.println("Até que valor negativo um inteiro consegue armazenar? " + Integer.MIN_VALUE);
		System.out.println("Qual o tamnha em bits de um inteiro? " + Integer.SIZE);
		System.out.println("Qual o tamnha em bytes de um inteiro? " + Integer.BYTES);
		
		
		int valor = idadeRef.intValue(); //unboxing
		String s = args[0]; //"10"
		//Integer numero = Integer.valueOf(s); // Unboxing
		int numero = Integer.parseInt(s);
		System.out.println("Parâmetro que recebemos através do run configuration: " + numero);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29); // Autoboxing -- O JAVA transforma automaticamente a variável idade em um objeto instanciado da classe integer para que possa adicionalo na lista, já que a lista só aceita referências a objetos
	}
}
