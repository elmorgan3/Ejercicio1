import java.util.Scanner;

public class Ejercicio39 {

	public static void main(String[] args) {
		// Dada una lista de 10 numeros calcular la media aritmetica
		
		Scanner entrada = new Scanner (System.in);
		
		int con = 0, resultado = 0;
		
		while (con < 10)
		{
			System.out.println("Introduce un numero. Te quedan " + (10-con));
			
			resultado = resultado + entrada.nextInt();
			
			con++;
		}
		
		resultado = resultado / con;
		
		System.out.println("La media es " + resultado);

	}

}
