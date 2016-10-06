import java.util.Scanner;

public class Ejercicio50 {

	public static void main(String[] args) {
		/* Fer un programa que calculi el N termes de la s�rie Fibonacci
		Exemple per N = 7, el resultat seria, ja
		a. La s�rie de Fibonacci seria: 1 1 2 3 5 8 13 ..
		b. Aquesta s�rie es calcula tenint en compte que el primer i segon valor de la s�rie �s 1, i a partir d'ells el
		tercer membre i successius es calculen amb la suma dels dos anteriors.
		c. S�ha de tenir en compte que no es pot calcular la s�rie de Fibonacci per un n�mero inferior a 2, i aix�
		s�ha de controlar.*/

		Scanner entrada = new Scanner (System.in);
		
		int num1 = 1, num2 = 1, total,c,resultado;
		
		System.out.println("Introduce el numero de dijitos que quieres que tenga tu serie Fibonacci(Recuerda que tiene que ser superurior a 2)");
		
		total = entrada.nextInt();
		
		if (total >= 2)
		{
			//Mostramos los dos primeros numeros fuera del bucle
			System.out.print(num1 + " " + num2);
			
			//Al bucle le decimos que tiene que dar vueltas hasta el numero que haya
			//dicho el usuario menos 2 que ya los hemos mostrado
			for (c=0; c != total-2; c++)
			{
				resultado = num1+num2;
				
				System.out.print(" " + resultado);

				num1 = num2;
				
				num2 = resultado;
			}
		}
		else
		{
			System.out.println("El numero no puede ser menor a 2");
		}
	}

}
