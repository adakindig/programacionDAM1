import java.util.Scanner;
public class Ejercicio26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 26.-Introducir una frase por teclado. Imprimirla en el centro de la pantalla.
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce una frase: ");
		
		String frase = teclado.nextLine();
		System.out.println(frase);
		
		teclado.close();
	}
}