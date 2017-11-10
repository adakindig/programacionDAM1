import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca una frase");
		String frase = teclado.nextLine();
		System.out.println("Introducir una letra");
		char letra = teclado.next().charAt(0);
		int contador = 0;
		for( int i=0; i<frase.length(); i++ ) {
		    if( frase.charAt(i) == letra ) {
		        contador++;
		    } 
		}
		System.out.println("Hay "+contador+" "+letra);	
		teclado.close();
	}
}
