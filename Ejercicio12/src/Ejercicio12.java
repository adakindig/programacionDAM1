
public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12.-Hacer un pseudoc�digo que imprima los n�meros del 1 al 100.Que calcule la suma de
		// todos los n�meros pares por un lado, y por otro,la de todos los impares. 

		int contador = 1, totalpar = 0, totalimpar = 0;
		while (contador <= 100){
			System.out.println(contador);
			if ((contador%2)==0){
				totalpar= totalpar+contador;
			}
			else {
				totalimpar= totalimpar+contador;
			}
			contador++;
		}
		System.out.println(totalpar);
		System.out.println(totalimpar);
	}
}