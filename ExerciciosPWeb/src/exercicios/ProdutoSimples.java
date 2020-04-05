package exercicios;
import java.util.Scanner;

public class ProdutoSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int prod, A, B;
		
		Scanner scan = new Scanner(System.in);
		A = scan.nextInt();
		B = scan.nextInt();
		
		prod = A * B;
		
		System.out.print("PROD = " + prod + "\n");
		
	}

}
