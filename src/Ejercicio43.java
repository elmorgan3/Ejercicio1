import java.util.Scanner;

public class Ejercicio43 {

	public static void main(String[] args) {
		// Calcular el valor mas grande, mas pequeño y la media aritmetica de una secuencia de numeros con el 0
		
		Scanner entrada = new Scanner (System.in);
		
		int max, min, media, con = 0, num;

		System.out.println("Introduce numeros y te diremos el mas grande, el mas pequeño y la media, para acabar pon un 0");
		
		num = entrada.nextInt();
		
		con++;
		
		max = num;
		
		min = num;
		
		media = num;
		
		while (num != 0)
		{
			System.out.println("Introduce numeros, para acabar pon un 0");
			
			num = entrada.nextInt();
			
			if (num > max)
			{
				max = num;
				con++;
			}
			else if (num < min && num != 0)
			{
				min = num;
				
				con++;
			}
			media = media + num;
			
		}
		media = media / con;
		
		System.out.println("El numero mas grande es "+ max + ", el mas pequeño es "+ min +", la media es "+ media);
	}

}
