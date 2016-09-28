import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// 10. Convertir euros a pesetas
		
		double euro, resultado;
		final double peseta = 166.39;

		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce la cantidad de euros para convertirla a pesetas");
		
		euro = entrada.nextDouble();
		
		resultado = euro * peseta;
		
		System.out.println("La conversion a pesetas es de " + resultado +" pesetas");
	}

}
