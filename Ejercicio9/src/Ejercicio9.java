import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 9.-Introducir un numero por teclado. Que nos diga si es positivo o negativo.
		
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		if (numero < 0){
			System.out.println("el n�mero introducido es negativo");
		}
		else {
			System.out.println("el n�mero introducido es positivo");
		}
		teclado.close();
	}
}
