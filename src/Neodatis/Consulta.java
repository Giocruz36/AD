package Neodatis;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.core.query.criteria.Where;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;

public class Consulta {
	public static void main(String[] args) {
		ODB odb = ODBFactory.open("mibdor.test");
		IQuery query = new CriteriaQuery(Jugadores.class, Where.like("ciudad", "%j%"));
		query.orderByAsc("edad");
		Objects<Jugadores> objects = odb.getObjects(query);
		System.out.println(objects.size());
		try {
			System.out.println(objects.toString());
		} catch (IndexOutOfBoundsException e) {
			System.out.printf("OBJETO NO LOCALIZADO");
		}
	}
}
