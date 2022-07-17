package ENCAPSULAMENTO;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaContaBanco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner openConta = new Scanner(System.in);
		
		ContaBanco contaBanco;
		
		System.out.println("Dados para abertura de conta: ");	
		
		System.out.print("Digite o numero da conta: ");
		int numero = openConta.nextInt();
		
		System.out.print("Nome do tituilar da conta: ");
		openConta.nextLine();
		String nomecliente = openConta.nextLine();
		
		System.out.print("Vai ter deposito de abertura de conta?: y/n? ");
		char depositoAbertura = openConta.next().charAt(0);
		
		if (depositoAbertura == 'y') {
			System.out.print("Digite o valor do deposito inicial: ");
			double depositoInicial = openConta.nextDouble();
			contaBanco = new ContaBanco(numero, nomecliente, depositoInicial);
		}else {contaBanco = new ContaBanco(numero, nomecliente);
		}
		
		System.out.println();
		System.out.print("Numero da conta: ");
		System.out.print(contaBanco);

		System.out.println();
		
		System.out.print("quer depositar mais algumn valor na conta? y/n?: ");
		char depositar = openConta.next().charAt(0);
		if (depositar == 'y') {
			System.out.print("Insira um valor de deposito: ");
			double depositoValor = openConta.nextDouble();
			contaBanco.depositar(depositoValor);
		} 
		
		System.out.println("Dados da conta atualizados: ");
		System.out.println(contaBanco);
		
		System.out.print("quer sacar algum valor da conta? y/n? ");
		char sacar = openConta.next().charAt(0);
		if (sacar == 'y') {
			System.out.print("Insira um valor de saque: ");
			double sacarValor = openConta.nextDouble();
			contaBanco.sacar(sacarValor);
		} 
		
		System.out.println();
		System.out.println("Dados da conta atualizados: ");
		System.out.println(contaBanco);
		
		
		
		openConta.close();
	}

}
