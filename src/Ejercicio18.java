import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// Introducir 4 numeros y decir si la suma de los dos primeros es mas grande, igual o mas pequeño que la suma de los dos ultimos
		
		int num1, num2, num3, num4, total1, total2;
		
		Scanner entrada = new Scanner (System.in);

		System.out.println("Introduce los dos primeros numeros");
		
		num1 = entrada.nextInt();
		
		num2 = entrada.nextInt();
		
		total1 = num1 + num2;
		
		System.out.println("Introduce los dos ultimos numeros");
		
		num3 = entrada.nextInt();
		
		num4 = entrada.nextInt();
		
		total2 = num3 + num4;
		
		if (total1 == total2)
		{
			System.out.println("La suma de los dos numeros son iguales, y es " + total1);
		}
		else if (total1 < total2)
		{
			System.out.println("La suma de los dos primeros numeros es " + total1 + " y es mas pequeña que la suma de los dos ultimos que son " + total2);
		}
		else 
		{
			System.out.println("La suma de los dos primeros numeros es " + total1 + " y es más grande que la suma de los dos ultimos que son " + total2);
		}
	}

}
