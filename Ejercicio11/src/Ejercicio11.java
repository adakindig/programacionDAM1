import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 11.-Imprimir y contar los m�ltiplos de 3 desde la unidad hasta un numero que 
		// introducimos por teclado.

		Scanner teclado = new Scanner (System.in);
		int numero = teclado.nextInt();
		int a=1, b=0;
		while (a < numero){
			if ((a%3==0)){
				System.out.println(a);
				b++;
			}
			a++;

		}
		System.out.println("la cuenta de divisibles para 3 es:"+b);
		teclado.close();
	}		
}

