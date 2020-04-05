package exercicios;
import java.util.Scanner;

public class AreaDoCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double area, raio;
		
		Scanner scan = new Scanner(System.in);
		raio = scan.nextDouble();
		
		area = 3.14159 * (raio * raio);
		
		System.out.printf("A=%.4f\n", area);
		
		
	}

}
