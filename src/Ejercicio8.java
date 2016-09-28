import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// 8. Calcular el area de un triangulo = base * altura / 2
		
		try 
		{
			double base, altura, area;
			
			Scanner entrada = new Scanner (System.in);
			
			System.out.println("Introduce la altura del triangulo.");
			
			altura = entrada.nextDouble();
			
			System.out.println("Introduce la base para calcular el area del triangulo");
			
			base = entrada.nextDouble();
			
			area = (base * altura) / 2;
			
			System.out.println("El area del triangulo es de " + area + " cm^2");
		}
		
		catch (Exception e)
		{
			System.out.println("Has introducido algun valor con el que no se puede operar");
		}

	}

}
