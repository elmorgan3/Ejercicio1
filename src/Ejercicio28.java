import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {
		// Intentar acertar un numero aleatorio entre 1 y 10 con 3 intentos
		
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
			}
			
			con--;
		}	

	}

}
