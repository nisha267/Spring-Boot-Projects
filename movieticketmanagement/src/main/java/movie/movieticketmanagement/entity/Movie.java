package movie.movieticketmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Movieinformation")
@Builder
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", length = 10)
	private int id;
	@Column(name = "moviename", length = 20)
	private String name;
	@Column(name = "genre", length = 20)
	private String genre;
	@Column(name = "showtime", length = 10)
	private String showtime;
	@Column(name = " price", length = 11)
	private double price;
	@Column(name = "available_seat", length = 10)
	private int seats;
	@Column(name = "Review", length = 50)
	private String review;

}
