import java.util.Scanner;

public class Ejercicio44 {

	public static void main(String[] args) {
		// Introduce un numero y muesra su tabla de multiplicar del 1 al 10
		
		Scanner entrada = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Escribe el numero del que quieres ver la tabla de multiplicar del 1 al 10.");
		
		numero = entrada.nextInt();
		
		for (int c = 1;c <= 10; c++)
		{
			System.out.println(numero + " x " + c + " = " + numero*c );
		}

	}

}
