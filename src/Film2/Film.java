package Film2;

import javax.persistence.*;

@Entity
@Table(name = "film2")
public class Film {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "film_id")
	private int film_id;
	@Column(name = "title")
	private String titulo;

	public Film() {
	}

	public Film(String titulo) {
		this.titulo = titulo;
	}

	public int getFilm_id() {
		return film_id;
	}

	public void setFilm_id(int film_id) {
		this.film_id = film_id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Film_text getFilm_text() {
		return enlace;
	}

	public void setFilm_text(Film_text enlace) {
		this.enlace = enlace;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "film_id")
	private Film_text enlace;
}
