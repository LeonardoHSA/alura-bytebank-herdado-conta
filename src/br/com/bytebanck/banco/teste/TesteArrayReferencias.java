package br.com.bytebanck.banco.teste;

import br.com.bytebanck.banco.modelo.Cliente;
import br.com.bytebanck.banco.modelo.Conta;
import br.com.bytebanck.banco.modelo.ContaCorrente;
import br.com.bytebanck.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

		public static void main(String[] args) {
			
			//ContaCorrente[] contas = new ContaCorrente[5];// Criando um array do tipo conta corrente, cada elemento deste array é do tipo conta corrente
			//Conta[] contas = new Conta[5]; // Deixando desta forma mais genérica conseguimos criar tanto conta corrente como conata poupança
			Object[] referencias = new Object[5]; // desta forma conseguimos criar qualquer tipo de objeto em um array, pois passamos como referência e como objeto a calsse object que é a classe com maior nivél hierarquico de qulaquer projeto java
			
			ContaCorrente cc1 = new ContaCorrente(22, 11); 
			referencias[0] = cc1;
			
			ContaPoupanca cp1 = new ContaPoupanca(22, 22);
			referencias[1] = cp1;
			
			Cliente cliente1 = new Cliente();
			referencias[2] = cliente1;
			
			
									
									//type cast
			ContaPoupanca ref = (ContaPoupanca) referencias[1]; // Desta forma se consegue transformar uma referência de um tipo mais genérico(Conta) em  um tipo mais específico(ContaPoupanca) utilizando a sintaxe do type cast
			System.out.println(cp1.getNumero());
			System.out.println(ref.getNumero());
		}
}
