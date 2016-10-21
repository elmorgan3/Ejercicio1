import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// 10. Convertir euros a pesetas
		
		double euro= 0, resultado;
		final double peseta = 166.39;

		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce la cantidad de euros para convertirla a pesetas");
		
		try
		{
			euro = entrada.nextDouble();
		}
		catch(Exception e)
		{
			System.out.println("Has introducido un valor con el que no se puede operar.");
		}
		
		resultado = euro * peseta;
		
		System.out.println("La conversion a pesetas es de " + resultado +" pesetas");
	}

}
