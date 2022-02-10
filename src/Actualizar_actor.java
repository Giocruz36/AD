import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Actualizar_actor {
	public static void main(String[] args) {
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Actor.class)
				.buildSessionFactory();
		Session miSession = miFactory.openSession();
		try {
			int Actorid = 233;
			miSession.beginTransaction();
			Actor miActor = miSession.get(Actor.class, Actorid);
			miActor.setFirst_name("eduardo m");
			miSession.getTransaction().commit();
			System.out.println("Registros actualizados");
			miSession.close();
		} finally {
			miFactory.close();
		}
	}

}
