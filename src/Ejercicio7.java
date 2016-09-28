import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Intercambiar los valores de dos variables introducidas previamente
		
		int A, B, aux;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce la primera variable");
		
		A = entrada.nextInt();
		
		System.out.println("Introduce la segunda variable variable");

		B = entrada.nextInt();
		
		System.out.println("La primera variable es " + A + ", la segunda variable es " + B);
		
		aux = A;
		
		A = B;
		
		B = aux;
		
		System.out.println("Ahora a primera variable es " + A + ", la segunda variable es " + B);
		
	}

}
