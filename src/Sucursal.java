
public class Sucursal {
	private int numeroSucursal;
	private String direccion;
	private String ciudad;
	
	public Sucursal(int numeroSucursal, String direccion, String ciudad) {
		this.numeroSucursal = numeroSucursal;
		this.direccion = direccion;
		this.ciudad = ciudad;
	}

	public int getNumeroSucursal() {
		return numeroSucursal;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	@Override
	public String toString() {
		return "Sucursal [Numero de Sucursal=" + numeroSucursal + 
						", Direccion=" + direccion + ", "
						+ "Ciudad=" + ciudad + "]";
	}
	
	

}
