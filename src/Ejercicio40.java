import java.util.Scanner;

public class Ejercicio40 {

	public static void main(String[] args) {
		// Calcular la suma de una secuencia de numeros acabada con 0
		Scanner entrada = new Scanner (System.in);
		
		int resultado, num;
		
		System.out.println("Introduce numeros para ir sumandolos, para terminar introduce un 0 para acabar");
		
		num = entrada.nextInt();
		
		resultado = num;
		
		while (num != 0)
		{
			System.out.println("Introduce numeros para ir sumandolos, vas por " + resultado + ", para terminar introduce un 0 para acabar");
			
			num = entrada.nextInt();
			
			resultado = resultado + num;
		}
		
		System.out.println("El resultado final es " + resultado);
		
	}

}
