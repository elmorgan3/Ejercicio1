import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// 12. A partir d'un valor X, calcular el valor de este polinomio X^3 + 3*X^2 + 7*X + 7
		
		double x, resultado;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce el valor de x");
		
		x = entrada.nextDouble();
		
		resultado = (x*x*x) + (3*(x*x)) + (7*x) + 7;
		
		System.out.println("El resultado es " + resultado);

	}

}
