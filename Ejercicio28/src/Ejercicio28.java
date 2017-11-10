/** 28.-Simular el lanzamiento de una moneda al aire e imprimir si ha salido cara o cruz. */
public class Ejercicio28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int moneda = 0;
		System.out.println("Lanza una moneda al aire: ");
		moneda = (int)((Math.random()*2))+1;
			if (moneda==1){
				System.out.println("Cara");
			}
			else{
				System.out.println("Cruz");
			}
			
	}

}
