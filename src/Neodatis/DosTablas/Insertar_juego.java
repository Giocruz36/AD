package Neodatis.DosTablas;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;

public class Insertar_juego {
	public static void main(String[] args) {
		ODB odb = ODBFactory.open("Juegos.neodatis");
		Objects<Consola> obj = odb.getObjects(Consola.class);
		Consola ps3 = obj.next();
		Consola ps4 = obj.next();
		Consola xbox360 = obj.next();
		Juego doom = new Juego("DOOM", "Bluray", 1, ps4);
		Juego battleborn = new Juego("Battleborn", "Bluray", 1, ps4);
		Juego sonic_generations = new Juego("Sonic Generations", "Dvd", 1, xbox360);
		Juego resident_evil_6 = new Juego("Resident Evil 6", "Bluray", 1, ps3);
		odb.store(doom);
		odb.store(battleborn);
		odb.store(sonic_generations);
		odb.store(resident_evil_6);
		odb.close();
	}
}
