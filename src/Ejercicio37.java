import java.util.Scanner;

public class Ejercicio37 {

	public static void main(String[] args) {
		// Introducir una cantidad de dinero y decir el numero minimo de billetes y monedas que le corresponden. 
		// Billetes y monedas: 500, 200, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01
		
		int billetes, moneda=0, importe, vuelta;
		
		
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce el importe a desglosar.");
		
		importe = entrada.nextInt();
		
		vuelta = 1;
		
		while (vuelta != 15)
		{
			switch (vuelta)
			{
			case 1:
				moneda = 500;
				vuelta++;
				break;
				
			case 2:
				moneda = 200;
				vuelta++;
				break;
				
			case 3:
				moneda = 100;
				vuelta++;
				break;
				
			case 4:
				moneda = 50;
				vuelta++;
				break;
				
			case 5:
				moneda = 20;
				vuelta++;
				break;
				
			case 6:
				moneda = 10;
				vuelta++;
				break;
				
			case 7:
				moneda = 5;
				vuelta++;
				break;
				
			case 8:
				moneda = 2;
				vuelta++;
				break;
				
			case 9:
				moneda = 1;
				vuelta++;
				break;
			
			}
			
			billetes = importe/moneda;
			
			if (billetes != 0)
			{
				importe = importe - (billetes*moneda);
				
				System.out.println(billetes +" de "+ moneda);
			}
		}
	}


	

}
