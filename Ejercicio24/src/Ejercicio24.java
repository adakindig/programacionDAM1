import java.util.Scanner;
public class Ejercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 24.-Comprobar si un n�mero mayor o igual que la unidad es primo.
		
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce un n�mero: ");
		int numero = teclado.nextInt(), primo = 2, contador=0;
		
		while (primo!=numero ){
			if ((numero%primo)== 0){
				contador=1;
			}
			primo++;
		}
		if(contador==1){
			System.out.println("El numero "+numero+" no es es primo");
		}
		else{
				System.out.println("El numero " +numero+ " es primo");
				}
		teclado.close();
			}
	}
