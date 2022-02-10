package Film2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Insertar_film {
	public static void main(String[] args) {
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Film.class)
				.addAnnotatedClass(Film_text.class).buildSessionFactory();
		Session miSession = miFactory.openSession();
		try {
			Film pelicula = new Film("loca acamedia");
			Film_text detalles_pelicula = new Film_text("Pelicula de comedia sobre la policia americana");
			pelicula.setFilm_text(detalles_pelicula);
			miSession.beginTransaction();
			miSession.save(pelicula);
			miSession.getTransaction().commit();
			System.out.println("registro insertado en la BBDD");
			miSession.close();
		} finally {
			miFactory.close();
		}
	}
}
