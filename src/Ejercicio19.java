import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// Hacer un programa que determine en una variable MIN el valor mas peque�o de tres variables
		
		int A, B, C, MIN;
		
		Scanner entrada = new Scanner (System.in);

		System.out.println("Introduce tres valores y diremos cual es mas peque�o");
		
		A = entrada.nextInt();
		
		B = entrada.nextInt();
		
		C = entrada.nextInt();
		
		if (A <= B && A <= C)
		{
			MIN = A;
			System.out.println("El numero mas peque�o es " + MIN);
		}
		
		else if (B <= A && B <= C)
		{
			MIN = B;
			System.out.println("El numero mas peque�o es " + MIN);
		}
		
		else if (C <= A && C <= B)
		{
			MIN = C;
			System.out.println("El numero mas peque�o es " + MIN);
		}

	}

}
