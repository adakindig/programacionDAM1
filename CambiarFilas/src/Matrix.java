import java.util.Scanner;
public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int matriz1[][] = new int [5][5];
		int comodin[] = new int [5];
		
		System.out.println("- - Matriz - -"); // Imprime Matriz Decortasion
		
		for (int i = 0; i < matriz1.length; i++) { // Recorre las filas
			for (int j = 0; j < matriz1[0].length; j++) { // Recorre las columnas
				matriz1[i][j] = (int)((Math.random()*20)-10); // Rellena la posicion [i][j] con un numero aleatorio entre -9 y 9
				System.out.printf("%2s ",matriz1[i][j] ); // Escribe la posicion [i][j] haciendo que ocupen 2 espacios
				
			}
			System.out.println(); // Imprime el salto de linea al acabar la fila
		}
		System.out.println();
		System.out.print("Introduzca una fila: ");
		int cambio1 = teclado.nextInt()-1;
		
		System.out.print("Introduzca un fila: ");
		int cambio2 = teclado.nextInt()-1;
		
		for (int j = 0; j < matriz1[0].length; j++) {
			comodin[j] = matriz1[cambio2][j];
			matriz1[cambio2][j]=matriz1[cambio1][j];
			matriz1[cambio1][j]=comodin[j];
		}
		System.out.println();
		
		System.out.println("- - Matriz - -"); // Imprime Matriz Decortasion
		
		for (int i = 0; i < matriz1.length; i++) { // Recorre las filas
			for (int j = 0; j < matriz1[0].length; j++) { // Recorre las columnas
				System.out.printf("%2s ",matriz1[i][j] ); // Escribe la posicion [i][j] haciendo que ocupen 2 espacios
			}
			System.out.println(); // Imprime el salto de linea al acabar la fila
		}
	}
}
