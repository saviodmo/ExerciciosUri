package exercicios;
import java.util.Scanner;

public class Media1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double A, B, media;
		
		Scanner scan = new Scanner(System.in);
		
		A = scan.nextDouble();
		B = scan.nextDouble();
			
		
		media = ((A * 3.5) + (B * 7.5)) / 11;
		
		System.out.printf("MEDIA = %.5f\n", media);
		
		
	}

}
