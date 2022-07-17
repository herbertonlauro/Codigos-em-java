package ABSTRACAO;

public class ContaBanco {
	int numeroConta;
	double saldo;
	double limite;
	
	void depositar(double valor) {
		this.saldo += valor;
	}	
	void sacar(double valor) {
		this.saldo -= valor;
	}
	void extrato(){
		System.out.println("Saldo: " +this.saldo);
	}
}


