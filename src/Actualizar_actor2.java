import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Actualizar_actor2 {
	public static void main(String[] args) {
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Actor.class)
				.buildSessionFactory();
		Session miSession = miFactory.openSession();
		try {
			miSession.beginTransaction();
			miSession.createQuery("update Actor set first_name='edu' where first_name like 'eduar%'").executeUpdate();
			miSession.getTransaction().commit();
			System.out.println("Registros actualizados");
			miSession.close();
		} finally {
			miFactory.close();
		}
	}
}
