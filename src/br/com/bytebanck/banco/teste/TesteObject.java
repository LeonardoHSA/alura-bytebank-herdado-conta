package br.com.bytebanck.banco.teste;

import br.com.bytebanck.banco.modelo.Cliente;
import br.com.bytebanck.banco.modelo.ContaCorrente;
import br.com.bytebanck.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
		
//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);
		
		ContaCorrente cc = new ContaCorrente(22, 33);
		ContaPoupanca cp = new ContaPoupanca(33, 22);
		Cliente cliente = new Cliente();
		
		System.out.println(cc.toString());
		System.out.println(cp);
		System.out.println(cliente);
		
		//println(cliente);

	}
	
	static void println() {}
	
	static void println(int a) {}
	
	static void println(boolean valor) {}
	
	static void println(Object referencia) {}

}
