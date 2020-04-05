package exercicios;

import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A, B, C, D, diferenca;
		
		Scanner scan = new Scanner(System.in);
		
		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextInt();
		D = scan.nextInt();
		
		diferenca = (A*B - C*D);
		
		System.out.print("DIFERENCA = " + diferenca + "\n");
		
		
	}

}
