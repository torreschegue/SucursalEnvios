
public class Paquete {
	
	private int numeroPaquete;
	private String ine;
	private int prioridad;
	private double peso;
	
	public Paquete(int numeroPaquete, String ine, int prioridad, double peso) {
		this.numeroPaquete = numeroPaquete;
		this.ine = ine;
		this.prioridad = prioridad;
		this.peso = peso;
	}

	public int getNumerPaquete() {
		return numeroPaquete;
	}

	public String getIne() {
		return ine;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public double getPeso() {
		return peso;
	}

	@Override
	public String toString() {
		return "Paquete [Numero de Paquete=" + numeroPaquete + ", INE =" + ine + ", Prioridad=" + prioridad + ", Peso="
				+ peso + "]";
	}
	
	

}
