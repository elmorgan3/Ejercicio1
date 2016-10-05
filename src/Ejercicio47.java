import java.util.Scanner;

public class Ejercicio47 {

	public static void main(String[] args) {
		// Descomponer un numero, pedido por teclado. EX: 5 = 5*4*3*2*1
		
		Scanner entrada = new Scanner (System.in);
		
		int num;
		
		System.out.println("Introduce un numero y lo descompondre hasta 0.");
		
		num = entrada.nextInt();
		
		System.out.println("La descomposicion del numero "+num+" es: ");
		while (num != 0)
		{
			System.out.print(num+" ");
			
			num--;
		}
		System.out.print("0.");
	}

}
