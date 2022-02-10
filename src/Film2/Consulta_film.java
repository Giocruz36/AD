package Film2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Consulta_film {
	public static void main(String[] args) {
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Film.class)
				.addAnnotatedClass(Film_text.class).buildSessionFactory();
		Session miSession = miFactory.openSession();
		try {
			miSession.beginTransaction();
			Film_text enlacet = miSession.get(Film_text.class, 1000);
			System.out.println(enlacet);
			System.out.println(enlacet.getPelicula());
			miSession.getTransaction().commit();
			System.out.println("registro insertado en la BBDD");
			miSession.close();
		} finally {
			miFactory.close();
		}
	}
}
