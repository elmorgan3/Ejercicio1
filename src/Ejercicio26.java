import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {
		// Pedir una nota numerica y mostrar u mensaje en funcion de la nota
		// Si es mayor o igual a 9 y menor o igual a 10, y la nota es excelente
		// Si es mayor y igual a 6.5 pero estrictamente menor a 9, la nota es notable
		// Si es mayor y igual a 5 pero estrictamente menor que 6.5. la nota es suficiente
		// Si es menor a 5 es suspenso
		
		Scanner entrada = new Scanner (System.in);
		
		double nota;
		
		System.out.println("Introduce la nota");
		
		nota = entrada.nextDouble();
		
		if (nota >= 9 && nota <= 10)
		{
			System.out.println("Has sacado un Excelente");
		}
		else if (nota >= 6.5 && nota < 9)
		{
			System.out.println("Has sacado un Notable");
		}
		else if (nota >= 5 && nota < 6.5)
		{
			System.out.println("Has sacado un Suficiente");
		}
		else if (nota < 5)
		{
			System.out.println("Has sacado un Suspenso");
		}
		else 
		{
			System.out.println("Esa nota no es posible");
		}
	}

}
