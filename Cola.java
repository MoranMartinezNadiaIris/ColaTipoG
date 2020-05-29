
public class Cola<j> {
	private j Esquina[];
	private int indice;
	/// constructor
	@SuppressWarnings("unchecked")
	public Cola(int n) {
		
		Esquina = (j[]) new Object [n];
		indice = 0;
	}
	public int cantidad() {
		return indice-1;
	}
	public void apilar(j valor) throws DesbordamientoCola {
		if(this.llenar()) {
			throw new DesbordamientoCola();
		}
		Esquina[indice] = valor;
		indice++;
	}
	public j sacar() throws SubDesbordamientoCola{
		if(this.vacia()) {
			throw new SubDesbordamientoCola();
		}
		j esacar;
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
