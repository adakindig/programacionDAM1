import java.util.Scanner;
public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 20.-Calcular el factorial de un numero, mediante subprogramas
		
		Scanner teclado = new Scanner (System.in);
		int num = 0, fact = 1;
		
		System.out.println("Introduce un numero: " );
		num = teclado.nextInt();
		
		while (num>0){
			fact = num *fact;
			num--;
			
		}
		System.out.println("Factorial: "+fact);
	}
}