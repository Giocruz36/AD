package Neodatis.DosTablas;

public class Consola {
	// Variables
	private String nombre;
	private int num_mandos_originales, num_mandos_clon, gb_hdd_int, gb_hdd_ext;

	// Constructor
	public Consola(String nombre, int num_mandos_originales, int num_mandos_clon, int gb_hdd_int, int gb_hdd_ext) {
		this.nombre = nombre;
		this.num_mandos_originales = num_mandos_originales;
		this.num_mandos_clon = num_mandos_clon;
		this.gb_hdd_int = gb_hdd_int;
		this.gb_hdd_ext = gb_hdd_ext;
	}

	public Consola() {
	}

	// Getter y setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNum_mandos_originales() {
		return num_mandos_originales;
	}

	public int getNum_mandos_clon() {
		return num_mandos_clon;
	}

	public void setNum_mandos_clon(int num_mandos_clon) {
		this.num_mandos_clon = num_mandos_clon;
	}

	public int getGb_hdd_int() {
		return gb_hdd_int;
	}

	public void setGb_hdd_int(int gb_hdd_int) {
		this.gb_hdd_int = gb_hdd_int;
	}

	public int getGb_hdd_ext() {
		return gb_hdd_ext;
	}

	public void setGb_hdd_ext(int gb_hdd_ext) {
		this.gb_hdd_ext = gb_hdd_ext;
	}

	public void setNum_mandos_originales(int num_mandos_originales) {
		this.num_mandos_originales = num_mandos_originales;
	}

}
