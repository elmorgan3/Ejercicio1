import java.util.Scanner;

public class Ejercicio46 {

	public static void main(String[] args) {
		// Visualizar los N primeros numeros impares positivos, N se introducira por teclado

		Scanner entrada = new Scanner (System.in);
		
		int n, cont = 1;
		
		System.out.println("Introduce un numero positivo y te diremos del 0 hasta dicho numero, que numeros son imapares");
		
		n = entrada.nextInt();
		
		System.out.print("Los numeros impares hasta el numero " + n + " son");
		
		while (cont <= n)
		{
			
			System.out.print(" "+ cont + ",");
			
			cont=cont+2;
		}
		System.out.println(" gracias por confiar en nosotros.");
	}

}
