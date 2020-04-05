package exercicios;

import java.util.Scanner;

public class Media2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double A, B, C, media;
		
		Scanner scan = new Scanner(System.in);
		
		A = scan.nextDouble();
		B = scan.nextDouble();
		C = scan.nextDouble();
		
		media = ((A * 2) + (B * 3) + (C * 5)) / 10;
		
		System.out.printf("MEDIA = %.1f\n", media);
		
		
	}

}
