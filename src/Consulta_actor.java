import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Consulta_actor {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Actor.class)
				.buildSessionFactory();
		Session miSession = miFactory.openSession();
		try {
			miSession.beginTransaction();
			List<Actor> losActores = miSession.createQuery("from Actor").getResultList();
			for (Actor unActor : losActores) {
				System.out.println(unActor);
			}
			miSession.getTransaction().commit();
			miSession.close();
		} finally {
			miFactory.close();
		}
	}

}
