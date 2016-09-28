import java.util.Scanner;

public class Ejercicio30 {

	public static void main(String[] args) {
		// Dado un caracter indicar si esta en mayuscula o en minuscula si no es ninguna mostrar un error
		
		Scanner entrada = new Scanner (System.in);
		
		String letra;
		
		//Para poder hacer comparaciones en al tabla asci devemos usar una variable de tipo char. Pero no podemos usar una
		//variable de tipo char para leer por teclado. Por eso lo leeamos en una variable de tipo String y luego la pasamos
		//a una variable de tipo char, usando el metodo .charAt(0) para que nos guarde la primera variable de la cadena
		char respuesta;
		
		System.out.println("Introduce una letra");
		
		letra = entrada.nextLine();
		
		respuesta = letra.charAt(0);
		
		if (respuesta>='A' && respuesta<='Z')
		{
			System.out.println("La letra es mayuscula");
		}
		else if (respuesta>='a' && respuesta<='z')
		{
			System.out.println("La letra es minuscula");
		}
		else 
		{
			System.out.println("Error");
		}
	}

}
