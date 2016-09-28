import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// 4. Introducir un importe en dolares y calcular su cambio a euros.
		
		try 
		{
			double resultado, num1;
			final double conversion = 0.92;
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Introduce la cantidad de dolares que quieres pasar a euros.");
			
			num1 = entrada.nextDouble();
			
			resultado = num1 * conversion;
			
			System.out.println("El cambio a euros es de " + resultado + " euros"); 
		}
		
		catch (Exception e)
		{
			System.out.println("Has introducido algun valor con el que no se puede operar");
		}

	}

}
