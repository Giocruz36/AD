import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Leer_Insertar {

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
			// lector registro
			miSession.beginTransaction();
			System.out.println("Lectura del registro con actor_id:" + actor1.getActor_id());
			Actor actorInsertado = miSession.get(Actor.class, actor1.getActor_id());
			System.out.println("registro: " + actorInsertado);
			miSession.getTransaction().commit();
			System.out.println("Terminado!!!");
			miSession.close();
		} finally {
			miFactory.close();
		}
	}

}
