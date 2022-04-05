package br.com.bytebanck.banco.modelo;

// quando se faz uma heran�a entre calsses, os atributos e m�todos s�o herdados menos os construtores
public class ContaCorrente extends Conta implements Tributavel {
	
	
	public ContaCorrente(int agencia, int numero) { // Desta maneira conseguimos chamar o construtor especifico da classe m�e Conta
		super(agencia, numero);
			
		}
		
	
		// Digitando saca e apertando Ctrl + espa�o conseguimos reescrever o m�todo saca, herdado da classe m�e Conta
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

