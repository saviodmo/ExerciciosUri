package exercicios;

import java.util.Scanner;

public class CalculoSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int codigoPeca, qtdPeca;
		double vlrPeca; 
		double vlrPagar = 0;
		
		Scanner scan = new Scanner(System.in);
		
		
		for(int i = 0; i <= 1; i++) {
			
			codigoPeca = scan.nextInt();
			qtdPeca = scan.nextInt();
			vlrPeca = scan.nextDouble();
			
			vlrPagar = vlrPagar + qtdPeca * vlrPeca;
			
		}
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", vlrPagar);
		
		
	}

}
