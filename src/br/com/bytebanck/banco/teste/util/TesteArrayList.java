package br.com.bytebanck.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

import br.com.bytebanck.banco.modelo.Conta;
import br.com.bytebanck.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		List<Conta> lista = new ArrayList<Conta>(); // Colocando <Conta> na criação do array se define que o array so pode guardar referencias do tipo conta
		
		Conta cc1 = new ContaCorrente(22, 11);
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(33, 311);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(33, 322);
		lista.add(cc4);
		
		System.out.println("Tamanho " + lista.size());
		
		Conta ref = (Conta) lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamanho " + lista.size());
		
		for(int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		System.out.println("");
		
		// Uma outra maneira de imprimir os objetos do array, desta forma o fro fica mais "limpo"
		for(Conta conta : lista) {
			System.out.println(conta);
		}
						
	}

}
