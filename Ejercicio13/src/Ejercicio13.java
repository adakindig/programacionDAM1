
public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 13.-Imprimir y contar los n�meros que son m�ltiplos de 2 o de 3 que hay entre 1 y 100.

		
		int contador = 0, muldos = 0, multres = 0;
		while (contador < 100){
			if ((contador%2)==0){
			muldos++;
			}
			if ((contador%3)==0){
			multres++;
			
			}
			contador++;
		}
		System.out.println(contador);
		System.out.println(muldos);
		System.out.println(multres);
	}
}
