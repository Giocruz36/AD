package Neodatis.DosTablas;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;

public class Insertar_consola {
	public static void main(String[] args) {
		Consola ps3 = new Consola("PS3", 1, 3, 160, 0);
		Consola ps4 = new Consola("PS4", 2, 0, 500, 1000);
		Consola xbox360 = new Consola("XBOX 360", 2, 0, 120, 0);
		ODB odb = ODBFactory.open("juegos.neodatis");
		odb.store(ps3);
		odb.store(ps4);
		odb.store(xbox360);
		odb.close();

	}
}
