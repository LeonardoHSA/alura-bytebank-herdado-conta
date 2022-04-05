public abstract class Conta { // Classe chamada Conta
	protected double saldo;	//	''	''	''	''	// Com o private fazemos com que atributo saldo não seja modificado e nem lido diretamente, sem que pase por um método da própria calsse
	private int agencia;	// atributos da classe
	private int numero;		//	''	''	''	''
	private Cliente titular; //	''	''	''	''
	// Se quisermos relacionar a nossa conta com algum cliente precisamos rferênciar o titular para a classe Cliente, como foi feito
	private static int total; // A palavra reservada static faz com que o atributo total seja da classe conta e não mais de seus objetos instanciados
	
	public Conta(int agencia, int numero) { // Esse é o construtor, se você não o escrever o java o faz sem que você perceba e deixa todos os valores dos atributos como padrão. O construtor não é 											um método ele é uma rotina de construção
		Conta.total++;// Com isso toda vez que se instanciar um objeto da classe conta se some o total de objetos criados
		this.agencia = agencia;  
		this.numero = numero;
	}
	
//	public abstract void deposita(double valor){ // Criando o método depositar
//		if(valor <= 0) {
//			System.out.println("Não pode valor menor ou igual a zero");
//			return;
//		}
//		this.saldo += valor; /* this é uma palavra reservada no java para referênciar o objeto que esteja invocando este método, que no caso é o objeto contaPaulo, ou qualquer conta que você 								esteja invocando determinado método*/
//	}
	
	public abstract void deposita(double valor);
	
	public void saca(double valor) throws SaldoInsuficienteException { /* Um método que retorna um valor booleano para o usuário ( true ou false)*/
//		if(this.saldo >= valor) {
//			this.saldo -= valor;
//			return true; /* O return é uma palavra chave do java, ele para a execução do método e volta (Retorna) para quem estava chamando o método, que no caso é a conta que estiver invocando o 								método*/
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
	
	// Agora que o atributo saldo é privado, temos que criar um método para que se possa consultar o saldo
	
	public double getSaldo() { /* get é uma convenção para quando queremos imprimir um valor na tela*/
		return this.saldo;
	}
	
	public int getNumero() { // Método que mostra o número da conta
		return this.numero;
	}
	
	public void setNumero(int novoNumero) { // Geralmente métodos que alteram algum valor não tem retorno algum, por isso o void
		if(novoNumero <= 0) {
			System.out.println("Não pode valor menor ou igual a 0");
		}
		this.numero = novoNumero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não pode valor menor ou igual a 0");
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
	
	public static int getTotal() { // Dentro de métodos estáticos não se coloca this
		return Conta.total;
	}
}

// Quando não se quer que nenhuma mensagem de retorno volte para o usuário colocamos a palavra reservada void no método a ser criado

// OBS: Não existe métodos dentro de métodos 