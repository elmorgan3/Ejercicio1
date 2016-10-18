import java.util.Scanner;

public class Ejercicio49 {

	public static void main(String[] args) {
		/* 49. Hacer un algoritmo que escriba un triabgulo Floyd. Leeremos un numero n que representara el numero de filas a escribir
		Exemple per N=4
		1
		2 3
		4 5 6
		7 8 9 10*/

		Scanner entrada = new Scanner (System.in);
		
		int linea, c = 1, x, y;
		
		System.out.println("¿Cuantas lineas quieres que tenga el triangulo Floyd?");
		
		linea = entrada.nextInt();
		
		for(x = 0; x != linea; x++)
		{
			for(y = 0; y <= x; y++)
			{
				System.out.print(c);
				
				c++;
			}
			System.out.println("");
		}
	}

}
