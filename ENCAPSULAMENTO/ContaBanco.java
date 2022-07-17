package ENCAPSULAMENTO;

public class ContaBanco {
	private int numeroConta;
	private String nomeCliente;
	private double saldo;
	
	//construtor
	public ContaBanco(int numeroConta, String nomeCliente) {
		this.numeroConta = numeroConta;
		this.nomeCliente = nomeCliente;
	}
	//construtor
	public ContaBanco(int numeroConta, String nomeCliente, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeCliente = nomeCliente;
		depositar(depositoInicial); 
	}

	public int getNunberConta() {
		return numeroConta;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	//metodo deposito
	public void depositar(double valor){
	    saldo += valor;
	}
	//metodo sacar
	public void sacar(double valor){
	    saldo -= valor + 5.0;
	}
	public String toString() {
		return "Conta Banco "
				+ numeroConta
				+ ", Nome do Cliente: "
				+ nomeCliente
				+ ", Saldo: $ "
				+ String.format("%.2f", saldo);
	}
}