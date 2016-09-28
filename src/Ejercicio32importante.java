import java.util.Scanner;

public class Ejercicio32importante {

	public static void main(String[] args) {
		// Hacer un programa que siga estas normas:
		//Decidir cual es el valor minimo para optar al descuento, que porcentaje se descuenta y el valor maximo posible
		//Pedir que introduzca el precio en euros 
		//Comprovar que el precio es correcto y que no es negativo
		//Si es negativo mostrar un mensaje de error
		//Si cumple, ver si el precio es igual o superior al valor minimo para optar al descuento
		//Si es asin calcular el descuento 
		//Comprovar que el descueto supera el maximo permisible 
		//si es asin el descuento se descuenta al maximo permisible
		//aplicar el descuento sobre el precio inicial 
		//Mostrar el precio final
		
		Scanner entrada = new Scanner (System.in);
		
		int precio, valorMin, porcentajeDesc, valorMax, descuento;
		
		System.out.println("Introduzca cual es el valor minimo para optar a un descuento");
		
		valorMin = entrada.nextInt();
		
		System.out.println("Que porcentaje se descuenta");
		
		porcentajeDesc = entrada.nextInt();
		
		System.out.println("Valor maximo permisible");
		
		valorMax = entrada.nextInt();
		
		System.out.println("Introduzca el precio del producto");
		
		precio = entrada.nextInt();
		
		if (precio <= 0)
		{
			
			System.out.println("Error");
		}
		else 
		{
			
			if (precio >= valorMin) 
			{
				
				descuento = (precio * porcentajeDesc) / 100;
				
				if (descuento > valorMax) 
				{
					precio = precio - valorMax;
				}
				else 
				{
					precio = precio - descuento;
				}
				
				System.out.println("El precio aplicandole el descuento es de " + precio);
			}
			else 
			{
				System.out.println("El precio es inferior al minimo para hacer el descuento");
			}
		}
	}
	

}
