import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//19.-Hacer un pseudocódigo que simule el funcionamiento de un reloj digital y que permita
		//ponerlo en hora.
		
		Scanner teclado = new Scanner (System.in);
		int bucle = 1;
		int segundos = 0, minutos = 0, horas = 0;
		System.out.println("Introduce los segundos: ");
		segundos = teclado.nextInt();
		while (segundos <0 || segundos >59){
			System.out.println("Vuelve a introducir los segundos: ");
		segundos = teclado.nextInt();
		}
		System.out.println("Introduce los minutos: ");
		minutos = teclado.nextInt();
		while (minutos <0 || minutos >59){
			System.out.println("Vuelve a introducir los minutos: ");
		minutos = teclado.nextInt();
		}
		System.out.println("Introduce las horas: ");
		horas = teclado.nextInt();
		while (horas <0 || horas >23){
			System.out.println("Vuelve a introducir las horas: ");
		horas = teclado.nextInt();
		}
		
		while (bucle==1){
			segundos++;
		if (segundos == 60){
			minutos++;
			segundos = 0;
			
		}
		if (minutos == 60){
			horas++;
			minutos = 0;
		}
		
		if (horas == 24){
			horas = 0;
		}
		Thread.sleep(1000);
		System.out.println(horas+":" +minutos+":" +segundos);
		
	}
		teclado.close();
	}
}