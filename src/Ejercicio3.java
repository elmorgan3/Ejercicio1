import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// 3. Introducir un importe y calcular cuanto tiene que pagar si se le aplica el 20% de descuento
		
		try 
		{
			double precio, resultado, descuento;
			final double descuentoPorCien = 20;

			Scanner entrada = new Scanner (System.in);
			
			System.out.println("Introduce el precio del producto y se le aplicara un descuento del " + descuentoPorCien + " %.");
			
			precio = entrada.nextDouble();
			
			descuento = (precio * descuentoPorCien) / 100;
			
			resultado = precio - descuento;
			
			System.out.println("El descuento es de " + descuento + " euros, el precio final es de " + resultado);
		}
		
		catch (Exception e)
		{
			System.out.println("Has introducido algun valor con el que no se puede operar");
		}
		
	}	


}
