import javax.swing.JOptionPane;

public class Ejercicio22 {

	public static void main(String[] args) {
		// Calcular la x de esta equacion: x = 10*a/b. Pedir el valor de a y b por teclado y tener en cuenta que divir por 0 no se puede hacer
		
		String a, b;
		int x;
		
		a = JOptionPane.showInputDialog("Introduce el valor de A");
		
		b = JOptionPane.showInputDialog("Introduce el valor de B");
		
		if (Integer.parseInt(b) == 0)
		{
			System.out.println("Has introducido un 0 en la variable de la division y no se puede realizar la operacion");
			
			System.exit(0);
		}
		
		x = 10 * Integer.parseInt(a) / Integer.parseInt(b);
		
		System.out.println("El valor de la equacion es " + x);
	}

}
