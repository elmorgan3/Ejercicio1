import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String args[]) {
		// 1. Calcular el area de un circulo. Formula: pi*r^2
		
		try 
		{
			double Resultado = 0;
			double Radio = 0;
			//Inicializamos una variable de tipo objeto de la clase Scanner para luego poder leer por teclado
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Escribe el radio del circulo.");
			
			// Usamos el objeto 
			
			Radio = entrada.nextDouble();
			
			Resultado = Math.PI * (Radio*Radio);
			
			System.out.println("El radio de la circunferencia es " + Resultado + " cm.");
		}
		
		catch (Exception e)
		{
			System.out.println("Has introducido algun valor con el que no se puede operar");
		}
		
	}
	
}
