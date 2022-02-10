import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Consulta_actor3 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Actor.class)
				.buildSessionFactory();
		Session miSession = miFactory.openSession();
		try {
			miSession.beginTransaction();
			List<Actor> losActores = miSession
					.createQuery("from Actor where first_name='ed'" + "and last_name like '%h%'").getResultList();
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
