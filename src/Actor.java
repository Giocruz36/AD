import javax.persistence.*;

@Entity
@Table(name = "actor")
public class Actor {
	@Id
	@Column(name = "actor_id")
	private int actor_id;

	@Column(name = "first_name")
	private String first_name;

	@Column(name = "last_name")
	private String last_name;

	public Actor() {

	}

	public Actor(String first_name, String last_name) {
		this.first_name = first_name;
		this.last_name = last_name;
	}

	public int getActor_id() {
		return actor_id;
	}

	public void setActor_id(int actor_id) {
		this.actor_id = actor_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	@Override
	public String toString() {
		return "actor [actor_id= " + actor_id + ", nombre=" + first_name + ", apellidos=" + last_name + "]";
	}
}
