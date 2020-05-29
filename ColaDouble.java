public class ColaDouble {

	private double Esquina[];
		private int indice;
		/// constructor
		public ColaDouble(int n) {
			
			Esquina = new double [n];
			indice = 0;
		}
		public int cantidad() {
			return indice-1;
		}
		public void apilar(double num) throws DesbordamientoCola {
			if(this.llenar()) {
				throw new DesbordamientoCola();
			}
			Esquina[indice] = num;
			indice++;
		}
		public double sacar() throws SubDesbordamientoCola{
			if(this.vacia()) {
				throw new SubDesbordamientoCola();
			}
			double esacar;
			esacar = Esquina[indice-1];
			indice--;
			return esacar;
			}
		public boolean vacia() {
			if(indice == 0) {
				return true;
			}
			return false;
		}
		public boolean llenar() {
			if(indice == Esquina.length) {
				return true;
			}
			return false;
		}
		public int capacidad() {
			return Esquina.length;
		}
	}

