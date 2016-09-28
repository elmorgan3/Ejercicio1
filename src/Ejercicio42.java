import java.util.Scanner;

public class Ejercicio42 {

	public static void main(String[] args) {
		// Decir cual es el valor mas grande de una secuencia de numeros acabada con un 0
		
		Scanner entrada = new Scanner (System.in);

		int num, max;
		
		System.out.println("Introduce numeros y al final te diremos el mas grande");
		
		num = entrada.nextInt();
		
		max = num;
		
		while (num != 0)
		{
			System.out.println("Introduce numeros y al final te diremos el mas grande");
			
			num = entrada.nextInt();
			
			if (num > max)
			{
				max = num;
			}
			
		}
		System.out.println("El numero mas grande es el " + max);
	}

}
