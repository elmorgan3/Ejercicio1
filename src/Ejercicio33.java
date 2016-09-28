import java.util.Scanner;

public class Ejercicio33 {

	public static void main(String[] args) {
		// Determinar cuanto cobra un trabajador por las horas extras realizadas. Cuando las horas de trabajo exceden de 40
		//se consideran extras y estas se pagan al doble de una hora normal cuando no exceden de 8, si las horas extras 
		//exceden de 8 se pagan al triple
		
		int precioHora, horas, sueldo;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("¿Cuanto cobra la hora?");

		precioHora = entrada.nextInt();
		
		System.out.println("¿Cuantas horas lleva?");
		
		horas = entrada.nextInt();
		
		if (horas <= 40)
		{
			sueldo = precioHora * horas;
		}
		else 
		{
			sueldo = precioHora * 40;
			
			horas = horas - 40;
			
			if (horas <= 8)
			{
				sueldo = (precioHora*2) * horas + sueldo;
			}
			else 
			{
				sueldo = (precioHora*2) * 8 + sueldo;
				
				horas = horas - 8;
				
				sueldo = (precioHora*3) * horas + sueldo;
			}
		}
		System.out.println("El sueldo del trabajador es de " + sueldo);
		
	}

}
