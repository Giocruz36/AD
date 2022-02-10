package Film2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Borrar_film {
	public static void main(String[] args) {
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Film.class)
				.addAnnotatedClass(Film_text.class).buildSessionFactory();
		Session miSession = miFactory.openSession();
		try {
			miSession.beginTransaction();
			Film pelicula = miSession.get(Film.class, 1015);
			if (pelicula != null) {
				System.out.println("Vamos a borrar la pelicula " + pelicula.getTitulo());
				miSession.delete(pelicula);
			} else {
				System.out.println("Nada que borrar");
			}
			miSession.getTransaction().commit();
			if (pelicula != null)
				System.out.println("registro eliminado");
			miSession.close();
		} finally {
			miFactory.close();
		}
	}
}
