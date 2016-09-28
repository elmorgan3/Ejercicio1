import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// Introducir dos numeros y decir cual es mas grande de los dos
		
		int num1, num2;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce dos numeros y te diremos cual es mas grande");
		
		num1 = entrada.nextInt();
		
		num2 = entrada.nextInt();
		
		if (num1 == num2) 
		{
			System.out.println("Los dos numeros son iguales");
		}
		else if (num1 < num2)
		{
			System.out.println("El numero " + num2 + " es mas grande que " + num1);
		}
		else
		{
			System.out.println("El numero " + num1 + " es mas grande que " + num2);
		}

	}

}
