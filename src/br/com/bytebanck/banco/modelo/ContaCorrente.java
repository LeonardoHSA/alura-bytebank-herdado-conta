package br.com.bytebanck.banco.modelo;

// quando se faz uma herança entre calsses, os atributos e métodos são herdados menos os construtores
public class ContaCorrente extends Conta implements Tributavel {
	
	
	public ContaCorrente(int agencia, int numero) { // Desta maneira conseguimos chamar o construtor especifico da classe mãe Conta
		super(agencia, numero);
			
		}
		
	
		// Digitando saca e apertando Ctrl + espaço conseguimos reescrever o método saca, herdado da classe mãe Conta
		@Override
		public void saca(double valor) throws SaldoInsuficienteException {
			// TODO Auto-generated method stub
			double valorASacar = valor + 0.2;
			super.saca(valorASacar);
		}


		@Override
		public void deposita(double valor) {
			super.saldo += valor; 
			
		}


		@Override
		public double getValorImposto() {
			return super.saldo * 0.01;
		}
		
		@Override
		public String toString() {
			
			return "Conta Corrente, " + super.toString();
		}
		
	}

