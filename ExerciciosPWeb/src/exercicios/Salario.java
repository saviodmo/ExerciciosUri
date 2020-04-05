package exercicios;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int id, nmHoras;
		double vlHoras, salario;
		
		Scanner scan = new Scanner(System.in);
		
		id = scan.nextInt();
		nmHoras = scan.nextInt();
		vlHoras = scan.nextDouble();
		
		
		salario = nmHoras * vlHoras;
		
		
		System.out.print("NUMBER = " + id + "\n");
		System.out.printf("SALARY = U$ %.2f\n", salario);
		
		
		
	}

}
