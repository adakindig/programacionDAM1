/**33.-Crear un array unidimensional de 20 elementos con nombres de personas. Visualizar los 
 elementos de la lista debiendo ir cada uno en una fila distinta.*/

public class Ejercicio33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] nombres = new String [21];

		System.out.print("Estas son los nombres de 20 personas:  "+"\n");
		for (int i = 1; i < nombres.length; i++) {
			nombres[i] = "persona"+i;
			System.out.println(nombres[i]+"\n");
		}
	}
}