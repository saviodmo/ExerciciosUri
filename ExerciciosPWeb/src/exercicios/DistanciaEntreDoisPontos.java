package exercicios;

import java.util.Scanner;
import java.lang.*;


public class DistanciaEntreDoisPontos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x1, y1, x2, y2, distancia;
		
		Scanner scan = new Scanner(System.in);
		
		x1 = scan.nextDouble();
		y1 = scan.nextDouble();
		x2 = scan.nextDouble();
		y2 = scan.nextDouble();
		
		distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

		System.out.printf("%.4f\n", distancia);
		
		
	}

}
