package movie.movieticketmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import movie.movieticketmanagement.entity.Movie;
import movie.movieticketmanagement.repository.Movierepository;

@SpringBootApplication
public class MovieticketmanagementApplication implements CommandLineRunner {
	@Autowired
	private Movierepository movierepository;

	public static void main(String[] args) {
		SpringApplication.run(MovieticketmanagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Movie m1 = Movie.builder().name("Avengers").genre("Action").showtime("11.30am").price(200.00).seats(102)
				.review("Blockbuster").build();

		movierepository.save(m1);

		System.out.println("-----All saved-----");

	}

}
