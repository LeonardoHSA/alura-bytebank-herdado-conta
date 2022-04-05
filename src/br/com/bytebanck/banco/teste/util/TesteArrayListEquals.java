package br.com.bytebanck.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebanck.banco.modelo.Conta;
import br.com.bytebanck.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
//		Conta cc1 = new ContaCorrente(2, 22);
//		Conta cc2 = new ContaCorrente(22, 22);
//		
//		boolean igual =  cc1.equals(cc2);
//		
//		System.out.println(igual);
		
		ArrayList<Conta> lista = new ArrayList<Conta>(); // Colocando <Conta> na criação do array se define que o array so pode guardar referencias do tipo conta
		
		Conta cc1 = new ContaCorrente(22, 11);
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 22);
		lista.add(cc3);
		
		
		boolean existe = lista.contains(cc3);
		System.out.println("Já existe?? " + existe);
		
		
		// Uma outra maneira de imprimir os objetos do array, desta forma o fro fica mais "limpo"
		for(Conta conta : lista) {
			System.out.println(conta);
		}
						
	}

}
