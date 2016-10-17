import java.util.Scanner;

public class Ejercicio50 {

	public static void main(String[] args) {
		/* 50 Fer un programa que calculi el N termes de la sèrie Fibonacci

		Exemple per N = 7, el resultat seria, ja

		a. La sèrie de Fibonacci seria: 1 1 2 3 5 8 13 ..
	
		b. Aquesta sèrie es calcula tenint en compte que el primer i segon valor de la sèrie és 1, i a partir d'ells el
	
		tercer membre i successius es calculen amb la suma dels dos anteriors.
		
		c. S’ha de tenir en compte que no es pot calcular la sèrie de Fibonacci per un número inferior a 2, i això
		
		s’ha de controlar.
		 */

		Scanner entrada = new Scanner (System.in);
		
		int n1= 1, n2=1, total=0, con, limite;
		
		System.out.println("Indica de cuanto quieres que sea la serie de Fibonacci");
		
		limite = entrada.nextInt();
		
		System.out.print("1 1");
		
		for (con = 0; con < limite-2; con++)
		{
			total= n1+n2;
			System.out.print(" "+total );
			
			n1=n2;
			n2=total;
		}
	}

}
