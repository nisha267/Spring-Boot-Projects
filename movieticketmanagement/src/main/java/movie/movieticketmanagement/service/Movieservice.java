package movie.movieticketmanagement.service;

import java.util.List;

import movie.movieticketmanagement.DTO.MovieDTO;
import movie.movieticketmanagement.entity.Movie;

public interface Movieservice {
	List<Movie> getAllMovies();

	Movie getAMovie(int id);

	Movie update(Movie movie, int id);

	String delete(int id);

	Movie getMovieByName(String name);

	Movie getMovieByShowtime(String showtime);

	Movie getMovieByGenre(String genre);

	Movie saveMovie(MovieDTO moviedto);
}
