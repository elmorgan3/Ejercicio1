import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Introducir un importe y un descuento en % y calcular el importe 
		
		try 
		{
			double precio, descuento, precioFinal;
		
			Scanner entrada = new Scanner (System.in);
	
			System.out.println("Introduce el precio del producto");
			
			precio = entrada.nextDouble();
			
			System.out.println("Introduce el tanto por ciento de descuento que quieres aplicar");
			
			descuento = entrada.nextDouble();
			
			precioFinal = (precio * descuento) / 100;
			
			System.out.println("El precio final es de " + precioFinal);
		}
		
		catch (Exception e)
		{
			System.out.println("Has introducido algun valor con el que no se puede operar");
		}

	}

}
