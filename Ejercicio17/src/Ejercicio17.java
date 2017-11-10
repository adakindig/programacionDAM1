import java.util.Scanner;
public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 17.-Imprimir, contar y sumar los múltiplos de 2 que hay entre una serie de números, tal
		// que el segundo sea mayor o igual que el primero.
		
		Scanner teclado = new Scanner (System.in);
		
		int contador = 0, x = 0, y = 0, sumamul= 0;
		x= teclado.nextInt();
		y= teclado.nextInt();
		
		while (x > y){
			System.out.println("El primer numero es mayor que el segundo, vuelva a introducir numeros");
			x= teclado.nextInt();
			y= teclado.nextInt();
		}
		while (x < y){
			if ((x%2)==0){
				contador++;
				sumamul = sumamul + x;
				System.out.println(x+ "Es multiplo de dos");
			}
			x++;
		}
		System.out.println(sumamul);
		System.out.println(contador);
		
		
	}
}