
public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 16.-Imprimir diez veces la serie de n�meros del 1 al 10.
		int unoaldiez = 0, bucle = 0;
			while (bucle < 10){
				unoaldiez++;
				System.out.printf("%3d ",+unoaldiez);	
				if (unoaldiez>=10) {
				bucle++;
				System.out.println();
				unoaldiez=0;
			}
				

	}
}
}