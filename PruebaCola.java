
public class PruebaCola {

	public static void main(String[] args) {
		Cola<Double> PI= new Cola<>(10);
		try {
			PI.apilar(67.11);
			PI.apilar(71.21);
			double v = PI.sacar();
			System.out.println(v);
		}catch(DesbordamientoCola E) {
			System.out.println(E.getMessage());
		}catch(SubDesbordamientoCola E) {
			System.out.println(E.getMessage());
		}
		/////////////////////////////
		Cola<String> PS = new Cola<>(10);
		try {
			PS.apilar("Esta es una cola generica");
			PS.apilar("como estas");
			String  S = PS.sacar();
			System.out.println(S);
		}catch(DesbordamientoCola E) {
			System.out.println(E.getMessage());
		}catch(SubDesbordamientoCola E) {
			System.out.println(E.getMessage());
		}
		///////////////////////
		Cola<Estudiante> PE = new Cola<>(10);
		try {
			Estudiante e1, e2;
			e1 = new Estudiante("Axel Arteaga Loma","1859768");
			e2 = new Estudiante("Nadia Moran Martinez","18590592");
			PE.apilar(e1);
			PE.apilar(e2);
			Estudiante Ref = PE.sacar();
			System.out.println(Ref);
		}catch(DesbordamientoCola E) {
			System.out.println(E.getMessage());
		}catch(SubDesbordamientoCola E) {
			System.out.println(E.getMessage());
		}
	}

}