import java.util.Scanner;
public class Horaobjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		Hora mihora = new Hora(teclado.nextInt(), teclado.nextInt(), teclado.nextInt()); 
		System.out.printf("%02d:%02d:%02d",mihora.getHora(),mihora.getMinuto(),mihora.getSegundo());
	}
}