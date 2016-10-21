import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// 2. Introducir dos numeros y calcular la suma.
		double num1 = 0, num2 = 0, resultado;
		
		Scanner entrada = new Scanner (System.in);
		
		try 
		{			
			System.out.println("Introduce el primer numero de la suma.");
			
			num1 = entrada.nextDouble();
			
			System.out.println("Introduce el segundo numero de la suma.");
			
			num2 = entrada.nextDouble();			
		}
		catch (Exception e)
		{
			System.out.println("Has introducido algun valor con el que no se puede operar");
		}	
		
		resultado = num1 + num2;
			
		System.out.println("El resultado de la suma es " + resultado);	 				
	}

}
