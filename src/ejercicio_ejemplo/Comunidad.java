package ejercicio_ejemplo;

public class Comunidad {
	private String nombre_comunidad,direccion;
	private int num_vecinos;
	
	public Comunidad() {
		
	}

	public Comunidad(String nombre_comunidad, String direccion, int num_vecinos) {
		super();
		this.nombre_comunidad = nombre_comunidad;
		this.direccion = direccion;
		this.num_vecinos = num_vecinos;
	}

	public String getNombre_comunidad() {
		return nombre_comunidad;
	}

	public void setNombre_comunidad(String nombre_comunidad) {
		this.nombre_comunidad = nombre_comunidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNum_vecinos() {
		return num_vecinos;
	}

	public void setNum_vecinos(int num_vecinos) {
		this.num_vecinos = num_vecinos;
	}
	
}
