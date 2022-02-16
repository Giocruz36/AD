package Neodatis;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.ObjectValues;
import org.neodatis.odb.Values;
import org.neodatis.odb.impl.core.query.values.ValuesCriteriaQuery;

public class Consulta5 {
	public static void main(String[] args) {
		ODB odb = ODBFactory.open("mibdor.test");
		Values groupby = odb
				.getValues(new ValuesCriteriaQuery(Jugadores.class).field("ciudad").count("nombre").groupBy("ciudad"));
		while (groupby.hasNext()) {
			ObjectValues objetos = (ObjectValues) groupby.next();
			System.out.printf("%s, %d%n", objetos.getByAlias("ciudad"), objetos.getByIndex(1));
		}
	}
}
