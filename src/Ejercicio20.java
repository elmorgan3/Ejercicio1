import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		// Hacer un programa que determine en una variable MIN el valor mas pequeño de 4 variables
		
		int A, B, C, D, min;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce 4 valores y te diremos cual es el mas pequeño");
		
		A = entrada.nextInt();
		
		B = entrada.nextInt();
		
		C = entrada.nextInt();
		
		D = entrada.nextInt();
		
		if (A <= B && A <= C && A <= D)
		{
			min = A;
			
			System.out.println("El numero mas bajo es " + min);
		}
		else if (B <= A && B <= C && B <= D)
		{
			min = B;
			
			System.out.println("El numero mas bajo es " + min);
		}
		else if (C <= B && C <= A && C <= D)
		{
			min = C;
			
			System.out.println("El numero mas bajo es " + min);
		}
		else if (D <= B && D <= C && D <= A)
		{
			min = D;
			
			System.out.println("El numero mas bajo es " + min);
		}
		
	}

}
