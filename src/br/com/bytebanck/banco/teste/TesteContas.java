package br.com.bytebanck.banco.teste;


import br.com.bytebanck.banco.modelo.ContaCorrente;
import br.com.bytebanck.banco.modelo.ContaPoupanca;
import br.com.bytebanck.banco.modelo.SaldoInsuficienteException;

public class TesteContas {
	
	public static void main(String[] args)throws SaldoInsuficienteException {
		
		// o nome modelo."classe" é chamado de Full Qualified Name ou FQN
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);// No caso o método deposita esta sendo herdado da classe Conta
		
	    ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
	}
}
