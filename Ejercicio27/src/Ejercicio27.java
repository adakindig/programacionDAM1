import java.util.Scanner;

/**27.-Realizar la tabla de multiplicar de un numero entre 0 y 10.*/

public class Ejercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		int numero = 0;
		int resultado = 0;
		do {System.out.println("Introduce un numero por teclado: ");
		numero = teclado.nextInt();	
		} while (numero <0 || numero >10);
		
		for (int i = 1; i <= 10; i++) {
			resultado = numero * i;
			System.out.printf("%02d X %02d = %02d\n",numero,i,resultado);
		}
		teclado.close();
}

}
