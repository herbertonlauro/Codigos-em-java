package CONSTRUTOR;

import java.util.Scanner;


public class programa {

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			
		
		System.out.println("########### chamando carro ###########");
		System.out.println("########### digite o modelo do carro ###########");
		String modelo = sc.next();
		System.out.println("########### digite a cor do carro ###########");
		String cor = sc.next();
		System.out.println("########### digite pre�o do carro ###########");
		Double preco = sc.nextDouble();
		Carro carrohonda = new Carro(cor, preco, modelo);
		
		System.out.println("O modelo do carro: "+ carrohonda.modelo);
		System.out.println("A cor do carro escolhido �: "+carrohonda.cor);
		System.out.println("o valor do carro �: "+carrohonda.preco);
		
		sc.close();
	}

	

}
