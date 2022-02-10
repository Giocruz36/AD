package Customer_Payment;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Consulta_cliente_pago {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Customer.class)
				.addAnnotatedClass(Payment.class).buildSessionFactory();
		Session miSession = miFactory.openSession();
		try {
			miSession.beginTransaction();
			String hql = "select A.nombre, A.apellido, B.cantidad from Customer A left join Payment B on A.cliente_id=B.cliente";
			System.out.println(hql);
			Query query = miSession.createQuery(hql);
			List results = query.list();
			System.out.println(results.size());
			for (int i = 0; i < results.size(); i++) {
				Object[] row = (Object[]) results.get(i);
				System.out.print("Nombre: " + row[0] + " " + row[1]);
				System.out.println(" Cantidad " + row[2]);
			}
			miSession.getTransaction().commit();
			System.out.println("listado obtenido de la BBDD");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			miSession.close();
			miFactory.close();
		}
	}
}
