package Neodatis;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.ObjectValues;
import org.neodatis.odb.Values;
import org.neodatis.odb.impl.core.query.values.ValuesCriteriaQuery;

public class Consulta3 {
	public static void main(String[] args) {
		ODB odb = ODBFactory.open("mibdor.test");
		Values valores = odb.getValues(new ValuesCriteriaQuery(Jugadores.class).field("nombre").field("ciudad"));
		while (valores.hasNext()) {
			ObjectValues objectValues = (ObjectValues) valores.next();
			System.out.printf("%s, Ciudad: %s %n", objectValues.getByAlias("nombre"), objectValues.getByIndex(1));
		}
		System.out.println(" Otra forma de hacerlo");
	}
}
