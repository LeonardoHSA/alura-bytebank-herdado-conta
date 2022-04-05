package br.com.bytebanck.banco.teste;

import br.com.bytebanck.banco.modelo.Conta;
import br.com.bytebanck.banco.modelo.ContaCorrente;
import br.com.bytebanck.banco.modelo.GuardadorDeContas;

public class TesteArray {
	
	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc1 = new ContaCorrente(22, 11);
		guardador.adiciona(cc1);
		
		Conta cc2 = new ContaCorrente(22, 22);
		guardador.adiciona(cc2);
		
		Conta cc3 = new ContaCorrente(22, 13);
		guardador.adiciona(cc3);
		
		int tamanho = guardador.getQuantidadeElemantos();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(2);
		System.out.println(ref);
	}
}
