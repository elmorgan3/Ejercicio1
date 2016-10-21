import java.util.Scanner;

public class Ejercicio52 {

	public static void main(String[] args) {
		// Hacer un programa para calcular el maximo comun divisor(m.c.d.) de dos numeros M y N
		// (enteros i > 0) usando el algoritmo de Euclides que dice:
		// 1 Dividir M por N y guardar el residuo R
		// 2 Si R es 0, N es la respuesta es el m.c.d. si no
		// 3 Haer M = N, N = R y a continuacion ir al paso 1

		Scanner entrada = new Scanner (System.in);
		
		double M, N, R = -1;
		
		System.out.println("Vamos a calcular el Maximo Comun Divisor.\n");
		
		System.out.println("Introduce el primer valor.");
		
		M = entrada.nextDouble();
		
		System.out.println("Introduce el segundo valor.");
		
		N = entrada.nextDouble();
		
		R = M % N;
		
		while(R != 0)
		{
			M = N;
			
			N = R;
			
			R = M % N; 				
		}
		
		System.out.println("El m.c.d. es " + N);
	}

}
