package ABSTRACAO;

import java.util.Locale;


public class ProgramaContaBanco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		ContaBanco conta = new ContaBanco();
		
		conta.depositar(1200.00);
		
		conta.extrato();
		
		
		
		
	}
	
}
