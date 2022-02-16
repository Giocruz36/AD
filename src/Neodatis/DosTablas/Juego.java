package Neodatis.DosTablas;

public class Juego {
	// variables
	private String titulo, formato;
	private int cant_almacenamiento;
	private Consola consola;

	// Constructor
	public Juego(String titulo, String formato, int cant_almacenamiento, Consola consola) {
		this.titulo = titulo;
		this.formato = formato;
		this.cant_almacenamiento = cant_almacenamiento;
		this.consola = consola;
	}

	public Juego() {
	}
	//Getter and Setter
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public int getCant_almacenamiento() {
		return cant_almacenamiento;
	}

	public void setCant_almacenamiento(int cant_almacenamiento) {
		this.cant_almacenamiento = cant_almacenamiento;
	}

	public Consola getConsola() {
		return consola;
	}

	public void setConsola(Consola consola) {
		this.consola = consola;
	}
	
	
}
