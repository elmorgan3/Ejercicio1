import java.util.Scanner;

public class Ejercicio45 {

	public static void main(String[] args) {
		// Introducir dos numeros n y m, hacer la tabla del 1 a n del numero m.
		
		Scanner entrada = new Scanner (System.in);
		
		int tabla, numero;
		
		System.out.println("Introduce el numero que quieres multiplicar.");
		
		numero = entrada.nextInt();
		
		System.out.println("Hasta que numero quieres multiplicar.");
		
		tabla = entrada.nextInt();
		
		for (int c = 1; c <= tabla; c++)
		{
			System.out.println(numero + " x " + c + " = " + numero*c);
		}

	}

}
