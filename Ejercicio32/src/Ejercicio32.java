/** 32.-Hacer un programa que nos permita introducir un n�mero por teclado y sobre el se realicen
  las siguientes operaciones: comprobar si es primo, hallar su factorial o imprimir su tabla de 
  multiplicar. */
import java.util.Scanner;
public class Ejercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca un n�mero: ");
		int numero = teclado.nextInt();
		System.out.println("Escoja una de las siguientes opciones:"+"\n"+"1)Calcular si es primo o no"+
		"\n"+"2)Hallar su factorial"+"\n"+"3)Realizar su tabla de multiplicar");
		int opcion = teclado.nextInt();
		if (opcion == 1){
		int primo = 2, contador=0;
			while (primo!=numero ){
				if ((numero%primo)== 0){
				contador=1;
				}
				primo++;
				}
				if(contador==1){
			System.out.println("El numero "+numero+" no es es primo");
				}
				else{
				System.out.println("El numero " +numero+ " es primo");
				}
		}
		if (opcion == 2){
				int fact = 1;
				while (numero>0){
					fact = numero *fact;
					numero--;
					
				}
				System.out.println("El factorial es "+fact);
			}
			if (opcion == 3){
				int resultado = 0;
				for (int i = 1; i <= 10; i++) {
					resultado = numero * i;
					System.out.printf("%02d X %02d = %02d"+"\n",numero,i,resultado);
				
				} 
			}
			teclado.close();
	}
}
