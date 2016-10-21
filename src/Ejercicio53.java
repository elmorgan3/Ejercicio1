import java.util.Scanner;

public class Ejercicio53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0;
		int m = 0;
		int	q = 0;
		int residu = 0;
		
		
		Scanner lector = new Scanner (System.in);
		
		System.out.println("Calcular el m�xim com� divisor");
		
		System.out.print("Introdueix el valor enter a dividir: ");
		m=lector.nextInt();
		lector.nextLine();
				
		System.out.print("Introdueix el valor enter com a divisor: ");
		n=lector.nextInt();
		lector.nextLine();
				
			
		
		//atribuir el valor dividend a una variable auxiliar per poder-la utilitzar en operacions aritm�tiques.
		residu=m;
		
		while(residu>=n){
			//fer restes fins que el resultat(dividend/m) sigui inferior al divisor.
			residu=residu-n;
			//comptar les restes per saber el quocient.
			q++;
		}
		System.out.println("El quoficient �s: "+ q +". "+ "El residu �s: "+residu+"." );
		
		lector.close();

	}

}
