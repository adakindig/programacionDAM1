/**34.-Hacer un programa que lea las calificaciones de un alumno en 10 asignaturas, las almacene 
 en un vector y calcule e imprima su media.*/

public class Ejercicio34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] calificaciones = new int[10];
		float media;
		int resultado = 0;
		System.out.print("Estas son las notas de un alumno: "+"\n");
		for(int f=0;f<10;f++) {
			calificaciones[f] = (int)((Math.random()*10))+1;
            resultado =resultado + calificaciones[f];
	}
		for(int f=0;f<10;f++) {
            System.out.println(calificaciones[f]);
        }
		media = resultado / 10;
			System.out.println("La media de dichas notas es: "+media);
		
		
	}
}