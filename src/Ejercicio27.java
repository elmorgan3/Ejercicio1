import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		// El ordenador piensa un numero entre 1 y 10 y el usuario lo intentara acertar si lo acierta mostrara un mensaje y sino otro
		
		int numero, respuesta;
		
		boolean acierto = false;
		
		Scanner entrada = new Scanner (System.in);
		
		numero = (int) (Math.random()*10+1);
		
		System.out.println("Intenta acertar el numero");

		respuesta = entrada.nextInt();
		
		if (respuesta == numero)
		{
			acierto = true;
		}
		
		if (acierto == true)
		{
			System.out.println("Has acertado");
		}
		else if (acierto == false)
		{
			System.out.println("No has acertado");
		}
	}

}
