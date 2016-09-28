import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// Pedir una cantidad en entero y decir cuantos billetes de 5, 10, 20, 50, 100 son equivalente
		
		int euros;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Di una cantidad de dinero en numeros enteros");
		
		euros = entrada.nextInt();

		System.out.println("Billetes de 100 euros: " + euros/100);
		System.out.println("Billetes de 50 euros: " + euros/50);
		System.out.println("Billetes de 20 euros: " + euros/20);
		System.out.println("Billetes de 10 euros: " + euros/10);
		System.out.println("Billetes de 5 euros: " + euros/5);
	}

}
