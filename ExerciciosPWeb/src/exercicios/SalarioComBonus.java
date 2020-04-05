package exercicios;

import java.util.Scanner;

public class SalarioComBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome;
		double salarioFixo, totalVendas, totalReceber;
		
		Scanner scan = new Scanner(System.in);
		
		nome = scan.next();
		salarioFixo = scan.nextDouble();
		totalVendas = scan.nextDouble();
		
		totalReceber = salarioFixo + (totalVendas * 0.15);
		
		
		System.out.printf("TOTAL = R$ %.2f\n", totalReceber);
		
		
	}

}
