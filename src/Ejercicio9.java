import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// 9. Calcular el area de una esfera Area = 4*pi*r^2
		
		double radio, area;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce el area de la esfera para calcular el area de la esfera");
		
		radio = entrada.nextDouble();
		
		area = 4 * Math.PI * (radio*radio);
		
		System.out.println("El area de la esfera es de " + area + " cm^2");

	}

}
