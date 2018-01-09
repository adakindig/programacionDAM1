import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int opcionmenu;
		int salida=0;
		int maxbolas;
		String color;
		Tragabolas tragabolas = new Tragabolas();

		while (salida==0){
			
			tragabolas.menu(); // Escribimos el menu
			do{
				opcionmenu = teclado.nextInt(); // Permitimos acceso al usuario
				teclado.nextLine();
			}while( opcionmenu < 1 && opcionmenu > 5); // Limitamos el uso a las opciones especificadas
			
			switch (opcionmenu) { // creamos un switch para las funciones que queremos asignar a cada opción
			case 1:
					System.out.print("Introduzca un color: ");
					color = teclado.nextLine();
					System.out.print("introduzca número máximo de bolas: ");
					maxbolas = teclado.nextInt();
					tragabolas.crearTragabolas(color, maxbolas);
					System.out.println();
				break;
			case 2:
					tragabolas.darcomer();
					System.out.println();
				break;
			case 3:

				break;
			case 4:

				break;
			case 5:
				salida=1;
				break;
			}
		}
	}
}