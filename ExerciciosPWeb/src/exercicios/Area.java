package exercicios;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		Scanner scan = new Scanner(System.in);
		
		A = scan.nextDouble();
		B = scan.nextDouble();
		C = scan.nextDouble();
		
		
		triangulo = (A*C)/2;
		circulo = 3.14159 * (C * C);
		trapezio = ((A + B)/2) * C ;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f\n", triangulo);
		System.out.printf("CIRCULO: %.3f\n", circulo);
		System.out.printf("TRAPEZIO: %.3f\n", trapezio);
		System.out.printf("QUADRADO: %.3f\n", quadrado);
		System.out.printf("RETANGULO: %.3f\n", retangulo);
		
		
	}

}
