import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 22.-Introducir una frase por teclado. Imprimirla cinco veces en filas consecutivas,
		// pero cada impresi�n ir desplazada cuatro columnas hacia la derecha.
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce una frase :");
		String texto = teclado.nextLine();	
		for (int i=0;i < 5;i++){
			System.out.println(texto);
			texto="    " + texto;
		}
		teclado.close();	
		}
	}