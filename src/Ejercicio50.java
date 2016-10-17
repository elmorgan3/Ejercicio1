import java.util.Scanner;

public class Ejercicio50 {

	public static void main(String[] args) {
		/* 50 Hacer un programa que calcule N digitos de la serie Fibonacci
		Ejemplo para N = 7, el resultado seria 1 1 2 3 5 8 13
		a. Esta serie se calcula teniendo en cuenta que el primer y el segundo numero es 1 y a partir de ellos el 
		tercero se calcula con la suma de los dos anteriores y asin sucesivamente		
		b.Hay que tener en cuenta que no se puede calcular la serie con un valor inferior  a 2, hay que controlarlo
		 */

		Scanner entrada = new Scanner (System.in);
		
		int n1= 1, n2=1, total=0, con, limite;
		
		System.out.println("Indica de cuanto quieres que sea la serie de Fibonacci");
		
		limite = entrada.nextInt();
		
		//Escribimos los dos primeros numero y los restamos luego al hacer el bucle porque ya estan puesto
		System.out.print("1 1");
		
		for (con = 0; con < limite-2; con++)
		{
			total= n1+n2;
			
			System.out.print(" "+total );
			
			n1=n2;
			
			n2=total;
		}
	}

}
