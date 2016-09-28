import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// Leer un numero si este es mas grande que 20 mostrar el 
		//numero elevado al cuadrado, si es mas pequeño mostrarlo elevado al cubo

		int num1;
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce un numero");
		
		num1 = entrada.nextInt();
		
		if (num1 > 20)
		{
			System.out.println("El numero " + num1 + " se a elevado al cuadrado y es " + num1*num1);
		}
		else 
		{
			System.out.println("El numero " + num1 + " se a elevado al cubo y es " + num1*num1*num1);
		}
	}
	

}
