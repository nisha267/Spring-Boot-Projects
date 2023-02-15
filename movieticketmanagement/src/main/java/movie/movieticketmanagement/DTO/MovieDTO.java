package movie.movieticketmanagement.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MovieDTO {
	@NotBlank(message = "Invalid movie Name:Empty name")
	@NotNull(message = "Invalid movie Name:name is null")
	@Size(min = 2, max = 50, message = "Name should be 2-50 characters")
	private String name;
	@NotBlank(message = "Invalid genre:Empty genre")
	@NotNull(message = "Invalid genre:genre is null")
	@Size(min = 2, max = 50, message = "genre should be 2-50 characters")
	private String genre;
	@NotBlank(message = "Invalid showtime:Empty showtime")
	@NotNull(message = "Invalid showtime:showtime is null")
	@Size(min = 4, max = 10, message = "genre should be 4-10 characters")
	private String showtime;
	private double price;
	private int seats;
	private String review;

}
