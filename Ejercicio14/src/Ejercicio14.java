import java.util.Scanner;
public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 14.-Hacer un código que imprima el mayor y el menor de una serie de cinco números 
		// que vamos introduciendo por teclado.
		
		System.out.println("introduce un número: ");
		Scanner teclado = new Scanner (System.in);
		
		// leemos el primer número
		int primernumero = teclado.nextInt();
		
		//el primer numero es a la vez el mayor y el menor de los cinco porque solamente existe él.
		int mayor = primernumero;
		int menor = primernumero;
		
		//nos va a servir para contar el número de veces que se introducen números
		int contador = 1;

		// será el número que el usuario introduzca cada vez
		int numero;
		
		while (contador < 5){
			System.out.println("introduce un número: ");
			numero = teclado.nextInt();
			
			//si el número nuevo es menor que el menor que había, entonces ahora el menor es el nuevo
			if (numero > mayor){
				mayor = numero;
			}
			else{
				//si el número nuevo es mayor que el mayor que había, entonces ahora el mayor es el nuevo
				if (numero < menor){
					menor = numero;
				}
			}
			contador++;
		}
		System.out.println("El menor es:" + menor);
		System.out.println("El mayor es:" + mayor);
		

		teclado.close();
		
	}
}