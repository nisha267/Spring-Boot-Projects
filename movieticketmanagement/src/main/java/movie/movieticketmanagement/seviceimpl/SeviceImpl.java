package movie.movieticketmanagement.seviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import movie.movieticketmanagement.DTO.MovieDTO;
import movie.movieticketmanagement.entity.Movie;
import movie.movieticketmanagement.repository.Movierepository;
import movie.movieticketmanagement.service.Movieservice;

@Service
public class SeviceImpl implements Movieservice {
	@Autowired
	private Movierepository movierepository;

	public Movie saveMovie(MovieDTO moviedto) {
		Movie movie = Movie.builder().name(moviedto.getName()).genre(moviedto.getGenre())
				.showtime(moviedto.getShowtime()).price(moviedto.getPrice()).seats(moviedto.getSeats())
				.review(moviedto.getReview()).build();
		return movierepository.save(movie);
	}

	@Override
	public List<Movie> getAllMovies() {
		// TODO Auto-generated method stub
		return movierepository.findAll();
	}

	@Override
	public Movie getAMovie(int id) {
		// TODO Auto-generated method stub
		return movierepository.findById(id).get();
	}

	@Override
	public Movie update(Movie movie, int id) {
		// TODO Auto-generated method stub
		Movie _movie = movierepository.findById(id).get();
		_movie.setName(movie.getName());
		_movie.setShowtime(movie.getShowtime());
		_movie.setPrice(movie.getPrice());
		;
		return movierepository.save(_movie);
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		movierepository.deleteById(id);
		return "The movie with id" + id + "has been deleted!!";
	}

	@Override
	public Movie getMovieByName(String name) {
		// TODO Auto-generated method stub
		return movierepository.getMovieByName(name);
	}

	@Override
	public Movie getMovieByShowtime(String showtime) {
		// TODO Auto-generated method stub
		return movierepository.getMovieByShowtime(showtime);
	}

	@Override
	public Movie getMovieByGenre(String genre) {
		// TODO Auto-generated method stub
		return movierepository.getMovieByGenre(genre);
	}

}
