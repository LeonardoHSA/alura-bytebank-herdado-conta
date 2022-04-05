package br.com.bytebanck.banco.teste;

import br.com.bytebanck.banco.modelo.CalculadorImposto;
import br.com.bytebanck.banco.modelo.ContaCorrente;
import br.com.bytebanck.banco.modelo.SeguroDeVida;

public class TesteTributaveis {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida sv = new SeguroDeVida();
		
		CalculadorImposto ci = new CalculadorImposto();
		ci.registra(cc);
		ci.registra(sv);
		
		
		System.out.println(ci.getTotalImposto());
	}

}
