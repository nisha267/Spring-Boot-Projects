package movie.movieticketmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import movie.movieticketmanagement.entity.Movie;

public interface Movierepository extends JpaRepository<Movie, Integer> {

	Movie getMovieByName(String name);

	Movie getMovieByShowtime(String showtime);

	Movie getMovieByGenre(String genre);

}
