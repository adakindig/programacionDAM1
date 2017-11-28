import java.util.Scanner;
public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 14.-Hacer un c�digo que imprima el mayor y el menor de una serie de cinco n�meros 
		// que vamos introduciendo por teclado.
		
		System.out.println("introduce un n�mero: ");
		Scanner teclado = new Scanner (System.in);
		
		// leemos el primer n�mero
		int primernumero = teclado.nextInt();
		
		//el primer numero es a la vez el mayor y el menor de los cinco porque solamente existe �l.
		int mayor = primernumero;
		int menor = primernumero;
		
		//nos va a servir para contar el n�mero de veces que se introducen n�meros
		int contador = 1;

		// ser� el n�mero que el usuario introduzca cada vez
		int numero;
		
		while (contador < 5){
			System.out.println("introduce un n�mero: ");
			numero = teclado.nextInt();
			
			//si el n�mero nuevo es menor que el menor que hab�a, entonces ahora el menor es el nuevo
			if (numero > mayor){
				mayor = numero;
			}
			else{
				//si el n�mero nuevo es mayor que el mayor que hab�a, entonces ahora el mayor es el nuevo
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