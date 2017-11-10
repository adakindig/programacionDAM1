import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 15.-Introducir dos números por teclado. Imprimir los números naturales que hay entre 
		// ambos números empezando por el mas pequeño, contar cuantos hay y cuántos de ellos son pares. 
		// Calcular la suma de los impares.

		Scanner teclado = new Scanner (System.in);
		int numero1, numero2, numerodetrabajo;
		int contadortotal = 0;
		int contadorpar = 0, sumaimpares = 0, mayor = 0, menor = 0;
		System.out.println("introduce un numero: ");
		numero1 = teclado.nextInt();
		System.out.println("introduce otro numero: ");
		numero2 = teclado.nextInt();
		
		if (numero1 > numero2){
			mayor = numero1;
			menor = numero2;
		}else{
			mayor = numero2;
			menor = numero1;
		}
		
		numerodetrabajo = menor;
		
		while (numerodetrabajo < mayor){
			System.out.println(numerodetrabajo);
			
			contadortotal++;			
			if ((numerodetrabajo%2)== 0){
				contadorpar++;
			}else{
				sumaimpares = sumaimpares + numerodetrabajo;
			}
			numerodetrabajo++;
		}
		System.out.println("Numeros naturales:"+contadortotal);
		System.out.println("Total pares:"+contadorpar);
		System.out.println("Suma de impares:"+sumaimpares);
	}
}