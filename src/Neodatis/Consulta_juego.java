package Neodatis;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;

import Neodatis.DosTablas.Juego;

public class Consulta_juego {
	public static void main(String[] args) {
		ODB odb = ODBFactory.open("juegos.neodatis");
		Objects<Juego> obj = odb.getObjects(Juego.class);
		System.out.println(obj.size() + " juegos.");
		while (obj.hasNext()) {
			Juego juego = obj.next();
			System.out.println("Título: " + juego.getTitulo() + "\n Formato: " + juego.getFormato()
					+ "\n Cantidad de almacenamiento: " + juego.getCant_almacenamiento() 
					+ " " + juego.getFormato() + "\n Plataforma: " 
					+ juego.getConsola().getNombre() + " "
					+ juego.getConsola().getNum_mandos_originales() + "\n");
		}
		odb.close();
	}

}
