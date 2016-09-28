import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// 15. Introducir un numero y decir si es negativo, positivo o neutro
		try 
		{
			Scanner entrada = new Scanner (System.in);
			
			int numero;
			
			System.out.println("Introduce un numero y te diremos si es negativo, positivo o neutro");
			
			numero = entrada.nextInt();
			
			if (numero < 0) 
			{
				System.out.println("El numero es negativo");
			}
			else if (numero > 0)
			{
				System.out.println("El numero es positivo");
			}
			else if (numero == 0) 
			{
				System.out.println("El numero es neutro");
			}
		}
		
		catch (Exception e)
		{
			System.out.println("Has escrito un caracter que no es numerico");
		}	
		
	}

}
