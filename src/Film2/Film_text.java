package Film2;

import javax.persistence.*;

@Entity
@Table(name = "film2_text")

public class Film_text {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "film_id")
	private int film_id;
	@Column(name = "descripcion")
	private String descripcion;
	@OneToOne(mappedBy="enlace", cascade=CascadeType.ALL)
	private Film pelicula;

	public Film getPelicula() {
		return pelicula;
	}

	public void setPelicula(Film pelicula) {
		this.pelicula = pelicula;
	}

	public Film_text() {
	}

	public Film_text(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getFilm_id() {
		return film_id;
	}

	public void setFilm_id(int film_id) {
		this.film_id = film_id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
