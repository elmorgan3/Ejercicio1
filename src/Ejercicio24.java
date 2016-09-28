import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		// Hacer un programa que sirva para calcular el perimetro de un rectangulo como el area de un rectangulo.
		// se le pedira el valor de los dos lados y que quiere hacer si el perimetro o el area.
		
		int a, b, respuesta;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce el valor de de los dos lados");
		
		a = entrada.nextInt();
		
		b = entrada.nextInt();
		
		System.out.println("Si quieres calcular el area pulsa 1, si quieres calcular el perimetro pulsa 2");
		
		respuesta = entrada.nextInt();
		
		if (respuesta == 1)
		{
			System.out.println("El area del rectangulo es " + a*b);
		}
		else if (respuesta == 2)
		{
			System.out.println("El perimetro del rectangulo es " + ((2*a) + (2*b)));
		}

	}

}
