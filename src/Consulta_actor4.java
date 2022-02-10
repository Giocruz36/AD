import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Consulta_actor4 {
	@SuppressWarnings({"rawtypes", "unchecked"})
	public static void main(String[] args) {
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Actor.class)
				.buildSessionFactory();
		Session miSession = miFactory.openSession();
		try {
			miSession.beginTransaction();
			String hql = "from Actor";
			Query query = miSession.createQuery(hql);
			List<Actor> results = query.list();
			for (Actor rs : results) {
				System.out.println(rs.getLast_name());
			}
			miSession.getTransaction().commit();
			miSession.close();
		} finally {
			miFactory.close();
		}

	}
}
