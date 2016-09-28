import java.util.Scanner;

public class Ejercicio41 {

	public static void main(String[] args) {
		// Calcular la media aritmetica de una serie de numeros, que acabe con el 0
		
		Scanner entrada = new Scanner (System.in);
		
		int resultado, num, con = 0;
		
		System.out.println("Introduce numeros para calcular la media aritmetica, para acabar introduce un 0");
		
		num = entrada.nextInt();
		
		resultado = num;
		
		con++;
		
		while (num != 0)
		{
			System.out.println("Introduce numeros para calcular la media aritmetica, llevas "+ con + " numeros, para acabar introduce un 0");
			
			num = entrada.nextInt();
			
			resultado = resultado + num ;
			
			con++;
		}

		resultado = resultado / con;
		
		System.out.println("La media es "+ resultado);

	}

}
