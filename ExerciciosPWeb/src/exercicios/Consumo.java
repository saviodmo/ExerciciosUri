package exercicios;

import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int X;
		double Y, cunsumoMedio;
		
		Scanner scan = new Scanner(System.in);
		
		X = scan.nextInt();
		Y = scan.nextDouble();
		
		cunsumoMedio = X/Y;
		
		System.out.printf("%.3f km/l\n",cunsumoMedio);
		
		
	}

}
