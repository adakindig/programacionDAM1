/** 31.-Introducir dos n�meros por teclado y mediante un men�, calcule su suma, su resta, 
 * su multiplicaci�n o su divisi�n.*/
import java.util.Scanner;
public class Ejercicio31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int numero1 = 0 , numero2 = 0;
		System.out.println("Introduzca un primer n�mero: ");
		numero1 = teclado.nextInt();
		System.out.println("Introduzca un segundo n�mero: ");
		numero2 = teclado.nextInt();
	
		System.out.println("Escoja una de las siguientes opciones:"+"\n"+"1)Sumar"+"\n"+"2)Restar"
		+"\n"+"3)Multiplicar"+"\n"+"4)Dividir");
		int opcion = teclado.nextInt();
		float resultado;
			if  (opcion == 1) {
				resultado = numero1 + numero2;
				System.out.println("El resultado es: "+resultado);
			}
			if (opcion == 2){
				resultado = numero1-numero2;
				System.out.println("El resultado es: "+resultado);
			}
			if (opcion == 3){
				resultado = numero1*numero2;
				System.out.println("El resultado es: "+resultado);
			}
			if (opcion == 4){
				resultado = numero1/numero2;
				System.out.println("El resultado es: " +resultado);
			}
			
		teclado.close();
	}

}
