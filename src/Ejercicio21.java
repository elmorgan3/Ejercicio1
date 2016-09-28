import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		// Escribir tres numeros y ordebarlos de mayor a menor 

		int A, B, C, min, med, max;
		
		Scanner entrada = new Scanner (System.in);
		
		min = 0;
		med = 0;
		max = 0;
		
		System.out.println("Introduce tres numero y los ordenaremos de mayor a menor");
		
		A = entrada.nextInt();
		
		B = entrada.nextInt();
		
		C = entrada.nextInt();
		
		if (A <= B && A <= C)
		{
			min = A;
			
			if (B <= C)
			{
				med = B;
				max = C;
			}
			else 
			{
				med = C;
				max = B;
			}
		}
		else if (B <= A && B <= C)
		{
			min = B;
			
			if (A <= C)
			{
				med = A;
				max = C;
			}
			else 
			{	
				med = C;
				max = A;
			}
		}
		else if (C <= A && C <= B)
		{
			min = C;
			
			if (A <= B)
			{
				med = A;
				max = B;
			}
			else 
			{
				med = B;
				max = A;
			}
		}
		System.out.println("El más grande es " + max + ", el mediano es " + med + ", el mas pequeño es " + min);
	}

}
