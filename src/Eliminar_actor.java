import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Eliminar_actor {
	public static void main(String[] args) {
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Actor.class)
				.buildSessionFactory();
		Session miSession = miFactory.openSession();
		try {
			miSession.beginTransaction();
			miSession.createQuery("delete Actor where first_name='edu'").executeUpdate();
			miSession.getTransaction().commit();
			System.out.println("Registros actualizados");
			miSession.close();
		} finally {
			miFactory.close();
		}
	}

}
