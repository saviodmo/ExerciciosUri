package exercicios;

import java.util.Scanner;

public class Esfera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double raio, volume;
		
		Scanner scan = new Scanner(System.in);
		
		raio = scan.nextDouble();
		
		volume = (4/3.0) * 3.14159 * (raio * raio * raio);
		
		System.out.printf("VOLUME = %.3f\n", volume);

	}

}
