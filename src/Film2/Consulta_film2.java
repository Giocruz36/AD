package Film2;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Consulta_film2 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Film.class)
				.addAnnotatedClass(Film_text.class).buildSessionFactory();
		Session miSession = miFactory.openSession();
		try {
			miSession.beginTransaction();
			String hql = "select A.titulo, B.descripcion from Film A left join Film_text B on A.film_id=B.film_id where A.film_id between 500 and 510";
			System.out.println(hql);
			Query query = miSession.createQuery(hql);
			List results = query.list();
			System.out.println(results.size());
			for (int i = 0; i < results.size(); i++) {
				Object[] row = (Object[]) results.get(i);
				System.out.print("Titulo " + row[0]);
				System.out.println(" Descripcion " + row[1]);
			}
			miSession.getTransaction().commit();
			System.out.println("listado obtenido de la BBDD");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			miSession.close();
			miFactory.close();
		}
	}
}
