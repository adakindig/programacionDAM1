import java.util.Scanner;
public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 18.-Hacer un pseudocódigo que cuente las veces que aparece una determinada letra en una
		// frase que introduciremos por teclado
		
		Scanner teclado = new Scanner (System.in);
		
		int contador = 0; 
		System.out.println("Introduce una frase :");
		String frase = teclado.nextLine();
		char letradet = teclado.nextLine().charAt(0);
		
		for(int p=0; p<frase.length(); p++){
			if ((frase.charAt(p))==letradet){
				contador++;
		}
		}
		System.out.println("Hay "+contador+" cantidad de "+letradet+" en la frase");
	
	}
}