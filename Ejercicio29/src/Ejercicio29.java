/** 29.-Simular cien tiradas de dos dados y contar las veces que entre los dos suman 10. */
public class Ejercicio29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dado1 = 0, dado2 = 0, sumadados = 0, contador = 0;
		
		System.out.println("Lanza los dados");
		while (contador <100){
		dado1 = (int)(Math.random()*6+1);
		dado2 = (int)(Math.random()*6+1);
		contador++;
		}
		if (dado1 + dado2 == 10){
			sumadados++;
		}
		System.out.println(sumadados);

		
		
		
	}
}