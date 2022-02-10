package Customer_Payment;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@Column(name = "customer_id")
	private int cliente_id;

	@Column(name = "first_name")
	private String nombre;

	@Column(name = "last_name")
	private String apellido;

	@OneToMany(mappedBy = "cliente")
	private List<Payment> pagos;

	public Customer(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getCliente_id() {
		return cliente_id;
	}

	public void setCliente_id(int cliente_id) {
		this.cliente_id = cliente_id;
	}

	public List<Payment> getPagos() {
		return pagos;
	}

	public void setPagos(List<Payment> pagos) {
		this.pagos = pagos;
	}

	@Override
	public String toString() {
		return "Customer [cliente_id=" + cliente_id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
}
