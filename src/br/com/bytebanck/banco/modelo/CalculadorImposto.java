package br.com.bytebanck.banco.modelo;

// Toda vez que se define um pacote para uma classe, o nome da classe muda e no caso desta classe fica: modelo.CalculadorImpostos
public class CalculadorImposto {
	
	private double totalImposto; 
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
}
