package exercicios;

import java.util.Scanner;
import java.lang.*;


public class OMaior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A, B, C, maior;
		
		Scanner scan = new Scanner(System.in);
		
		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextInt();
		
		maior = (A + B + Math.abs(A-B))/2;
		maior = (maior + C + Math.abs(maior-C))/2;
		
		
		System.out.print(maior + " eh o maior\n");
		
		
		
	}

}
