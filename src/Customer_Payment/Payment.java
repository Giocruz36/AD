package Customer_Payment;

import javax.persistence.*;

@Entity
@Table(name = "payment")
public class Payment {

	@Id
	@Column(name = "payment_id")
	private int pago_id;

	@Column(name = "amount")
	private double cantidad;

	@ManyToOne()
	@JoinColumn(name = "customer_id")
	private Customer cliente;

	public Payment() {
	}

	public Payment(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Customer getCliente() {
		return cliente;
	}

	public void setCliente(Customer cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Payment [pago_id=" + pago_id + ", cantidad=" + cantidad + ", cliente=" + cliente + "]";
	}

}
