import java.util.Scanner;

public class Ejercicio51 {

	public static void main(String[] args) {
		/* 51. Hacer un programa que dibuje una figura parecida a la representada
		   a continuaciónhabiendo leido un numero por teclado, en este caso un 4 		
	     *
		***
	   *****
	  *******
*/
		Scanner entrada = new Scanner(System.in);
		
		/*Vairables*/
		int col, fil;
		int numero,EspacioEnBlanco,Asterisco;
		
		System.out.println("Introduce el numero de filas que quieres que tenga la piramide.");
		
		numero = entrada.nextInt();
		
		EspacioEnBlanco = numero-1;
		
		Asterisco=1;
		
		for(fil = 1; fil <= numero; fil++)
		{
			// Imprimir espacios
			for(col=1; col<=EspacioEnBlanco; col++)
			{
				System.out.print(" ");
			}
			
			// IMPRIMIR ELS ASTERISCS
			for(col=1; col<=Asterisco; col++)
			{
				System.out.print("*");
			}
		
			EspacioEnBlanco=EspacioEnBlanco-1;
			
			Asterisco=Asterisco+2;
			
			System.out.println();
		}
	}
}
