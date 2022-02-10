package Film;

import javax.persistence.*;

@Entity
@Table(name = "film_category")
public class Film_categoria {
	@Id
	@Column(name = "film_id")
	private int film_id;
	@Column(name = "category_id")
	private int category_id;

	public Film_categoria() {
	}

	public Film_categoria(int film_id, int category_id) {
		this.film_id = film_id;
		this.category_id = category_id;
	}

	public int getFilm_id() {
		return film_id;
	}

	public void setFilm_id(int film_id) {
		this.film_id = film_id;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	@Override
	public String toString() {
		return "Film_categoria [film_id=" + film_id + ", category_id=" + category_id + "]";
	}
}
