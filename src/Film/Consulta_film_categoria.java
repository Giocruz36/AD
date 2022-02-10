package Film;

import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Consulta_film_categoria {
	public static void main(String[] args) {
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Film_categoria.class).buildSessionFactory();
		Session miSession = miFactory.openSession();
		try {
			miSession.beginTransaction();
			List<?> clasificaciones = miSession.createQuery(
					"select count(category_id), category_id from Film_categoria group by category_id order by count(category_id) desc")
					.getResultList();
			for (int i = 0; i < clasificaciones.size(); i++) {
				Object[] row = (Object[]) clasificaciones.get(i);
				System.out.print("Dato :" + i);
				System.out.println(" cantidad - " + row[0] + " categorias " + row[1]);
			}
			miSession.getTransaction().commit();
		} finally {
			miSession.close();
			miFactory.close();
		}
	}
}
