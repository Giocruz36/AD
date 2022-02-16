package Neodatis;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;

public class Insertar_datos {

	public static void main(String[] args) {
		Jugadores j1 = new Jugadores("Maria", "voleibol", "Madrid", 14);
		Jugadores j2 = new Jugadores("Miguel", "tenis", "Madrid", 15);
		Jugadores j3 = new Jugadores("Mario", "baloncesto", "Guadalajara", 15);
		Jugadores j4 = new Jugadores("Alicia", "tenis", "Madrid", 14);
		ODB odb = ODBFactory.open("mibdor.test");
		odb.store(j1);
		odb.store(j2);
		odb.store(j3);
		odb.store(j4);
		Objects<Jugadores> objects = odb.getObjects(Jugadores.class);
		System.out.printf("%d Jugadores: %n", objects.size());
		int i = 1;
		while (objects.hasNext()) {
			Jugadores jug = objects.next();
			System.out.printf("%d: %s. %s, %s %n", i++, jug.getNombre(), jug.getDeporte(), jug.getCiudad(),
					jug.getEdad());
		}
		odb.close();
	}
}
