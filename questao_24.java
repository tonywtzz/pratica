package pratica_dev;

import java.util.Scanner;
public class questao_24 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
	  
		System.out.println("Digite o custo de fábrica: ");
		double custo_fabrica = scanner.nextDouble();
		
		System.out.println("Digite a porcentagem do distribuidor: ");
		double distribuidor = scanner.nextDouble();
		
		System.out.println("Digite os impostos: ");
		double impostos = scanner.nextDouble();
		
		double custo_carro =  custo_fabrica + distribuidor + impostos;
		
		double desconto = ( custo_carro * 73 ) / 100;
		
		System.out.print("O custo final ao consumidor é: " + desconto);
		
			
		

	}

}
