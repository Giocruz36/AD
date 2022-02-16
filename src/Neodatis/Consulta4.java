package Neodatis;

import java.math.BigDecimal;
import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.ObjectValues;
import org.neodatis.odb.Values;
import org.neodatis.odb.impl.core.query.values.ValuesCriteriaQuery;

public class Consulta4 {
	public static void main(String[] args) {
		ODB odb = ODBFactory.open("mibdor.test");
		Values valores = odb.getValues(new ValuesCriteriaQuery(Jugadores.class).sum("edad"));
		ObjectValues ov = valores.nextValues();
		System.out.println("La suma de todas las edades es :" + ov.getByAlias("edad"));
		BigDecimal value = (BigDecimal) ov.getByAlias("edad");
		int dato = 10 + value.intValue();
		System.out.println("La suma de todas las edades es :" + dato);
	}
}
