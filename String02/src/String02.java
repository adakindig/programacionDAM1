/**Dada una frase de no m�s de 80 caracteres hacer un programa que busque cu�ntas may�sculas
 y min�sculas tiene y lo imprima*/
import java.util.Scanner;
public class String02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		String frase = teclado.nextLine();
		do {
			System.out.println(frase);
		} while (frase < 80);
		
		
		
		
		teclado.close();
	}
}