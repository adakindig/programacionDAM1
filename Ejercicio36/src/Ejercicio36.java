/** 36.-Generar una matriz de 4 filas y 5 columnas con n�meros aleatorios entre 1 y 100, e imprimirla. */
public class Ejercicio36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz [][] =  new int [4][5];
		System.out.println("Esta es una matriz aleatoria de dimensiones 4x5: "+"\n");
		for(int f=0;f<4;f++) {
			for (int i = 0; i < 5; i++) {
				matriz[f][i] = (int)((Math.random()*100)+1);
			System.out.printf("%3s ",matriz[f][i]);	
			}
			System.out.println();
		}
	}
 }
