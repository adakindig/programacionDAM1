/** 35.-Usando el segundo ejemplo, hacer un programa que busque una nota en el vector. */
import java.util.Scanner;
public class Ejercicio35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		int[] calificaciones;
		calificaciones = new int[10];
		for(int f=0;f<10;f++) {
			calificaciones[f] = (int)((Math.random()*10))+1;
	}
		for(int f=0;f<10;f++) {
        }
		System.out.println("Introduzca la asignatura de la cual desees conocer la nota: ");
		int asignaturas = teclado.nextInt();
		if (asignaturas > 10 || asignaturas < 0){
			System.out.println("La asignatura introducida no es v�lida");
		}
		else {
			System.out.println("La nota de la asignatura es: " +(int)(Math.random()*10+1));
		}
	teclado.close();
	}
}