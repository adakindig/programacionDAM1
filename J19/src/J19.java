import java.util.Scanner;
public class J19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int activaor = 1;
		System.out.println("Introduzca segundos");
		int segundos = teclado.nextInt();
		while (segundos>60 || segundos<0){
			segundos = teclado.nextInt();
		}
		System.out.println("Introduzca minutos");
		int minutos = teclado.nextInt();
		while (minutos>60 || minutos<0){
			minutos = teclado.nextInt();
		}
		System.out.println("Introduzca horas");
		int horas = teclado.nextInt();
		while (horas>23 || horas<0){
			horas = teclado.nextInt();
		}
		while (activaor==1){
			segundos++;
			if (segundos==60){
				minutos++;
				segundos = 0;
			}
			if (minutos==60){
				horas++;
				minutos = 0;
			}
			if (horas==24){
				horas = 0;
			}
			System.out.printf("%02d"+":"+"%02d"+":"+"%02d %n",horas,minutos,segundos);
		}
		
		
	}

}
