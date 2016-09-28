import java.util.Scanner;

public class Ejercicio29 {

	public static void main(String[] args) {
		// Igual que el 28 pero por cada intento decir si el numero es mas grande o mas pequeño
		
		int respuesta, numero, con = 3;
		
		boolean acierto = false;
		
		Scanner entrada = new Scanner (System.in);
		
		numero = (int) (Math.random()*10+1);
		
		while (con != 0)
		{
			System.out.println("Intenta acertar el numero tienes " + con + " intentos");
			
			respuesta = entrada.nextInt();
			
			if (respuesta == numero)
			{
				acierto = true;
			}
			
			if (acierto == true )
			{
				System.out.println("Has acertado");
				
				System.exit(0);
			}
			else 
			{
				System.out.println("Has fallado");
				
				if (numero < respuesta)
				{
					System.out.println("El numero es más pequeño");
				}
				else 
				{
					System.out.println("El numero es más grande");
				}
			}
			
			con--;
		}
		

	}

}
