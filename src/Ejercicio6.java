import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// 6. Introducir la edad de una persona y enseñar el equivalente en dias y segundos
		
		try 
		{
			int edad, dias, segundos;
		
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Introduce tu edad y te diremos los dias y segundos que tienes");
			
			edad = entrada.nextInt();
			
			dias = edad * 365;
			
			segundos = edad * 365 * 24 * 60 * 60;
			
			System.out.println("Has vivido " + dias + " dias y " + segundos + " segundos.");
		}
		
		catch (Exception e)
		{
			System.out.println("Has introducido algun valor con el que no se puede operar");
		}
		
	}

}
