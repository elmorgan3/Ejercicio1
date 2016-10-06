import java.util.Scanner;

public class Ejercicio48 {

	public static void main(String[] args) {
		/* Visulizar un cuadrado de n asteriscos, pedido por teclado EX: ****
																	     ****
		                                                                 ****
		                                                                 ****
		                                                                      */
		
		Scanner entrada= new Scanner (System.in);
		
		int x, y, num;
		
		System.out.println("Introduce con un numero del que quieras el tamaño del cuadrado");
		
		num = entrada.nextInt();	
		
		//Este bucle hace las lines y por cada vuelta salta de linea has el numero que hayan dicho EX: si ponen dos habra dos lineas
		for(x = 0; x != num; x++)
		{
			//Este bucle escribe los asteriscos que el usuario haya dicho
			for (y = 0; y != num; y++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
