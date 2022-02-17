package ejercicio_ejemplo;

public class Vecino {
	
	private String nombre_vecino,piso,comunida;
	private int telefono;
	
	public Vecino() {
	
	}

	public Vecino(String nombre_vecino, String piso, String comunida, int telefono) {
		super();
		this.nombre_vecino = nombre_vecino;
		this.piso = piso;
		this.comunida = comunida;
		this.telefono = telefono;
	}

	public String getNombre_vecino() {
		return nombre_vecino;
	}

	public void setNombre_vecino(String nombre_vecino) {
		this.nombre_vecino = nombre_vecino;
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	public String getComunida() {
		return comunida;
	}

	public void setComunida(String comunida) {
		this.comunida = comunida;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
	

}
