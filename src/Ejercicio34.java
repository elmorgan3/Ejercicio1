import java.util.Scanner;

public class Ejercicio34 {

	public static void main(String[] args) {
		// 34.Calcular l'import que un treballador rep en el repartiment anual de beneficis si aquest se li assigna com un 
		//percentatge del seu salari mensual que depèn de la seva antiguitat en l'empresa d'acord amb la taula:

		Scanner entrada = new Scanner (System.in);
		
		int sueldo, sueldoExtra;
		
		double tiempo;
		System.out.println("¿Cual es tu sueldo anual?");
		
		sueldo = entrada.nextInt();
		
		System.out.println("Introduce tu antigüedad en la empresa");
		
		tiempo = entrada.nextDouble();
		
		if (tiempo < 1)
		{
			sueldoExtra = (sueldo * 5) / 100;
			
			System.out.println("A su sueldo hay que añadirle un 5% que es " + sueldoExtra + " y el total es " + (sueldo + sueldoExtra));
		}
		else if (tiempo >= 1 && tiempo < 2)
		{
			sueldoExtra = (sueldo * 7) / 100;
			
			System.out.println("A su sueldo hay que añadirle un 7% que es " + sueldoExtra + " y el total es " + (sueldo + sueldoExtra));
		}
		else if (tiempo >= 2 && tiempo < 5)
		{
			sueldoExtra = (sueldo * 10) / 100;
			
			System.out.println("A su sueldo hay que añadirle un 10% que es " + sueldoExtra + " y el total es " + (sueldo + sueldoExtra));
		}
		else if (tiempo >= 5 && tiempo < 10)
		{
			sueldoExtra = (sueldo * 15) / 100;
			
			System.out.println("A su sueldo hay que añadirle un 15% que es " + sueldoExtra + " y el total es " + (sueldo + sueldoExtra));
		}
		else if (tiempo >= 10)
		{
			sueldoExtra = (sueldo * 20) / 100;
			
			System.out.println("A su sueldo hay que añadirle un 20% que es " + sueldoExtra + " y el total es " + (sueldo + sueldoExtra));
		}
		
	}

}
