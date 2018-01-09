
public class Hora {

		private int hora, minuto, segundo;

		public Hora(int hora, int minuto, int segundo) {
			super();
			if ( hora <= 23 && hora > 0){
				this.hora = hora;
			}
			else{
				hora = 0;
			}
			if ( minuto <= 59 && minuto > 0){
				this.minuto = minuto;
			}
			else{
				minuto = 0;
			}
			if ( segundo <= 59 && segundo > 0){
				this.segundo = segundo;
				}
			else{
				segundo = 0;
			}
		}

		public int getHora() {
			return hora;
		}

		public void setHora(int hora){
			if ( hora <= 23 && hora > 0){
				this.hora = hora;
			}
		}

		public int getMinuto() {
			return minuto;
		}

		public void setMinuto(int minuto) {
			if ( minuto <= 59 && minuto > 0){
				this.minuto = minuto;
			}
		}

		public int getSegundo() {
			return segundo;
		}

		public void setSegundo(int segundo) {
			if ( segundo <= 59 && segundo > 0){
			this.segundo = segundo;
			}
			
			
		}
		
	}
