import java.util.Scanner;

public class Ejercicio31 {

	public static void main(String[] args) {
		// Hacer el juego de piedra papel tijeras, preguntando a cada jugador su jugada y diciendo el resultado
		
		Scanner entrada = new Scanner (System.in);
		
		int j1, j2;
		
		System.out.println("Jugador 1: Para elegir piedra pulsa 1, para elegir papel pulsa 2 y para elegir tijeras pulsa 3.");
		
		j1 = entrada.nextInt();
		
		System.out.println("Jugador 2: Para elegir piedra pulsa 1, para elegir papel pulsa 2 y para elegir tijeras pulsa 3.");

		j2 = entrada.nextInt();
		
		if (j1 == j2)
		{
			System.out.println("Habeis empatado");
		}
		else if (j1 == 1 && j2 == 2)
		{
			System.out.println("El jugador 2 a ganado con papel y el jugador 1 a perdido con piedra");
		}
		else if (j1 == 1 && j2 == 3)
		{
			System.out.println("El jugador 1 a ganado con piedra y el jugador 2 a perdido con tijeras");
		}
		
		else if (j1 == 2 && j2 == 1)
		{
			System.out.println("El jugador 1 a ganado con papel y el jugador 2 a perdido con piedra");
		}
		else if (j1 == 2 && j2 == 3)
		{
			System.out.println("El jugador 2 a ganado con tijeras y el jugador 1 a perdido con papel");
		}
		
		else if (j1 == 3 && j2 == 1)
		{
			System.out.println("El jugador 2 a ganado con piedra y el jugador 1 a perdido con tijeras");
		}
		else if (j1 == 3 && j2 == 2)
		{
			System.out.println("El jugador 1 a ganado con tijeras y el jugador 2 a perdido con papel");
		}
	}

}
