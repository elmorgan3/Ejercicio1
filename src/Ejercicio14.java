import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// Pedir una cantidad en entero y descomponer en billetes de 5, 10, 20, 50, 100 s

		int billetes, euros, eurosRestantes;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce la cantidad de euros a descomponer");
		
		euros = entrada.nextInt();
		
		billetes = euros / 100;
		
		eurosRestantes = euros % 100;
		
		System.out.print("Son " + billetes + " billetes de 100 euros, mas ");
		
		billetes = eurosRestantes / 50;
		
		eurosRestantes = eurosRestantes % 50;
		
		System.out.print( billetes + " billetes de 50 euros, mas ");
		
		billetes = eurosRestantes / 20;
		
		eurosRestantes = eurosRestantes % 20;
		
		System.out.print(billetes + " billetes de 20 euros, mas ");
		
		billetes = eurosRestantes / 10;
		
		eurosRestantes = eurosRestantes % 10;
		
		System.out.print(billetes + " billetes de 10 euros, mas ");
		
		billetes = eurosRestantes / 5;
		
		eurosRestantes = eurosRestantes % 5;
		
		System.out.print(billetes + " billetes de 5 euros y faltan "+ eurosRestantes + " euros");
			
	}

}
