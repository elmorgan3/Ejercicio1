import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// 11. Si tenemos tres variables A, B y C. Intercambiar las variables de la siguiente manera, con una var auxiliar
		// B coge el valor de A
		// C coge el valor de B
		// A coge el valor de C
		
		String A, B, C, aux;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce el valor de A");
		
		A = entrada.nextLine();
		
		System.out.println("Introduce el valor de B");
		
		B = entrada.nextLine();
		
		System.out.println("Introduce el valor de C");
		
		C = entrada.nextLine();
		
		aux = B;
		
		B = A;
		
		A = C;
		
		C = aux;
		
		System.out.println("El valor de A es: " + A);
		
		System.out.println("El valor de B es: " + B);
		
		System.out.println("El valor de C es: " + C);

	}
	
}
