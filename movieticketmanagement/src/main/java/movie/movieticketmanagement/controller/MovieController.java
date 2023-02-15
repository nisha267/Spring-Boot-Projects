package movie.movieticketmanagement.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import movie.movieticketmanagement.DTO.MovieDTO;
import movie.movieticketmanagement.entity.Movie;
import movie.movieticketmanagement.service.Movieservice;

@RestController
@RequestMapping(value = "/api")
public class MovieController {
	@Autowired
	private Movieservice movieservice;

	@GetMapping("/movie")
	public List<Movie> getAllMovies() {
		return movieservice.getAllMovies();
	}

	@GetMapping("/movie/{id}")
	public Movie getCAMovie(@PathVariable int id) {
		return movieservice.getAMovie(id);
	}

	@PostMapping("/movie")
	public ResponseEntity<Movie> saveMovie(@RequestBody @Valid MovieDTO moviedto) {
		return new ResponseEntity<>(movieservice.saveMovie(moviedto), HttpStatus.CREATED);
	}

	@PutMapping("/movie/{id}")
	public Movie updateEmployee(@PathVariable int id, @RequestBody Movie movie) {
		return movieservice.update(movie, id);
	}

//get employee by name
	@GetMapping("/movieByname")
	public Movie getAmovieByName(@RequestParam String name) {
		return movieservice.getMovieByName(name);
	}

	// get employee by email
	@GetMapping("/movieBytime")
	public Movie getMovieByShowtime(@RequestParam String showtime) {
		return movieservice.getMovieByShowtime(showtime);
	}

	@GetMapping("/movieBygenre")
	public Movie getMovieByGenre(@RequestParam String genre) {
		return movieservice.getMovieByGenre(genre);
	}

	@DeleteMapping("/movie/{id}")
	public String deleteCEmployee(@PathVariable int id) {
		return movieservice.delete(id);
	}
}
