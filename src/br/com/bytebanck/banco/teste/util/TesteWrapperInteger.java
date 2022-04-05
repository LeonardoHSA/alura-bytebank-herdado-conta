package br.com.bytebanck.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
	
	public static void main(String[] args) {
		
		
		int idade = 29; //Integer
		Integer idadeRef = Integer.valueOf(29); // Autoboxing
		System.out.println("Transformando o valor de um inteiro em um double: " + idadeRef.doubleValue());
		
		System.out.println("At� que valor um inteiro comsegue armazenar? " + Integer.MAX_VALUE);
		System.out.println("At� que valor negativo um inteiro consegue armazenar? " + Integer.MIN_VALUE);
		System.out.println("Qual o tamnha em bits de um inteiro? " + Integer.SIZE);
		System.out.println("Qual o tamnha em bytes de um inteiro? " + Integer.BYTES);
		
		
		int valor = idadeRef.intValue(); //unboxing
		String s = args[0]; //"10"
		//Integer numero = Integer.valueOf(s); // Unboxing
		int numero = Integer.parseInt(s);
		System.out.println("Par�metro que recebemos atrav�s do run configuration: " + numero);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29); // Autoboxing -- O JAVA transforma automaticamente a vari�vel idade em um objeto instanciado da classe integer para que possa adicionalo na lista, j� que a lista s� aceita refer�ncias a objetos
	}
}
