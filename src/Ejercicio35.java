
public class Ejercicio35 {

	public static void main(String[] args) {
		// Visualizar los 20 primeros numeros naturales con un a) while, b) do while, c) for
		
		//bucle while 
		int i = 1;
		
		System.out.print("Bucle While: 1");
		
		while (i < 20 )
		{
			i++; 
			
			System.out.print(", " + i);
		}
		
		//bucle do while 
		i = 1;
		
		System.out.print("\nBucle do while: 1");
		
		do 
		{
			i++;
			
			System.out.print(", " + i);
		}
		while (i <20);
		
		//Bucle for
		System.out.print("\nBucle for: ");
		for (i = 1; i <= 20; i++)
		{
			System.out.print(i + ", ");
		}
	}

}
