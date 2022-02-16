package Neodatis.DosTablas;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;

public class Consulta_consola {
	public static void main(String[] args) {
		ODB odb = ODBFactory.open("juegos.neodatis");
		Objects<Consola> obj = odb.getObjects(Consola.class);
		System.out.println(obj.size() + " consolas.");
		while (obj.hasNext()) {
			Consola con = obj.next();
			System.out.println("Consola: " + con.getNombre() + "\n Mandos originales :" + con.getNum_mandos_originales()
					+ "\n Mandos clon: " + con.getNum_mandos_clon() + "\n Capacidad disco duro interno: "
					+ con.getGb_hdd_int() + "\n Capacidad disco duro externo:" + con.getGb_hdd_ext() + "\n");
		}
		odb.close();
	}

}
