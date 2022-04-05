public abstract class Conta { // Classe chamada Conta
	protected double saldo;	//	''	''	''	''	// Com o private fazemos com que atributo saldo n�o seja modificado e nem lido diretamente, sem que pase por um m�todo da pr�pria calsse
	private int agencia;	// atributos da classe
	private int numero;		//	''	''	''	''
	private Cliente titular; //	''	''	''	''
	// Se quisermos relacionar a nossa conta com algum cliente precisamos rfer�nciar o titular para a classe Cliente, como foi feito
	private static int total; // A palavra reservada static faz com que o atributo total seja da classe conta e n�o mais de seus objetos instanciados
	
	public Conta(int agencia, int numero) { // Esse � o construtor, se voc� n�o o escrever o java o faz sem que voc� perceba e deixa todos os valores dos atributos como padr�o. O construtor n�o � 											um m�todo ele � uma rotina de constru��o
		Conta.total++;// Com isso toda vez que se instanciar um objeto da classe conta se some o total de objetos criados
		this.agencia = agencia;  
		this.numero = numero;
	}
	
//	public abstract void deposita(double valor){ // Criando o m�todo depositar
//		if(valor <= 0) {
//			System.out.println("N�o pode valor menor ou igual a zero");
//			return;
//		}
//		this.saldo += valor; /* this � uma palavra reservada no java para refer�nciar o objeto que esteja invocando este m�todo, que no caso � o objeto contaPaulo, ou qualquer conta que voc� 								esteja invocando determinado m�todo*/
//	}
	
	public abstract void deposita(double valor);
	
	public void saca(double valor) throws SaldoInsuficienteException { /* Um m�todo que retorna um valor booleano para o usu�rio ( true ou false)*/
//		if(this.saldo >= valor) {
//			this.saldo -= valor;
//			return true; /* O return � uma palavra chave do java, ele para a execu��o do m�todo e volta (Retorna) para quem estava chamando o m�todo, que no caso � a conta que estiver invocando o 								m�todo*/
//		} else {
//			return false;
//		}
		
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		} 
		
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);	
	}
	
	// Agora que o atributo saldo � privado, temos que criar um m�todo para que se possa consultar o saldo
	
	public double getSaldo() { /* get � uma conven��o para quando queremos imprimir um valor na tela*/
		return this.saldo;
	}
	
	public int getNumero() { // M�todo que mostra o n�mero da conta
		return this.numero;
	}
	
	public void setNumero(int novoNumero) { // Geralmente m�todos que alteram algum valor n�o tem retorno algum, por isso o void
		if(novoNumero <= 0) {
			System.out.println("N�o pode valor menor ou igual a 0");
		}
		this.numero = novoNumero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("N�o pode valor menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() { // Dentro de m�todos est�ticos n�o se coloca this
		return Conta.total;
	}
}

// Quando n�o se quer que nenhuma mensagem de retorno volte para o usu�rio colocamos a palavra reservada void no m�todo a ser criado

// OBS: N�o existe m�todos dentro de m�todos 