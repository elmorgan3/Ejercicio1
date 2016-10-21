import java.util.Scanner;

public class Ejercicio53 {

	public static void main(String[] args) {
		// Hacer un programa para dividir dos numeros enteros M y N por el metodo de 
		// restas succesivas, dando como resultado el cociente y el residuo

		Scanner entrada = new Scanner (System.in);
		
		int residuo, cociente = 0, M, N;
		
		System.out.println("Introduce el numero a dividir.");
		
		M = entrada.nextInt();
		
		System.out.println("Introduce el numero divisor");
		
		N = entrada.nextInt();
		
		residuo = M;
		
		while(residuo >= N)
		{
			residuo=residuo - N;
			
			cociente++;
		}
		System.out.println("El coficiente es: "+ cociente +". El residuo es: "+residuo);
	}

}
