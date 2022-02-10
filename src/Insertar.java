import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Insertar {

	public static void main(String[] args) {
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Actor.class)
				.buildSessionFactory();
		Session miSession = miFactory.openSession();
		try {
			Actor actor1 = new Actor("Pedro", "Jimenez");
			miSession.beginTransaction();
			miSession.save(actor1);
			miSession.getTransaction().commit();
			System.out.println("registro insertado en la BBDD");
			miSession.close();
		} finally {
			miFactory.close();
		}

	}

}
