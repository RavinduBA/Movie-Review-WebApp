package com.ravindu2.movie;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * This class is a REST controller that handles HTTP requests related to movies.
 * It maps requests to the /api/v1/movies endpoint and uses the MovieService to fetch movie data.
 */
@RestController  // Indicates that this class is a REST controller, capable of handling HTTP requests and returning JSON responses
@RequestMapping("/api/v1/movies")  // Maps requests to /api/v1/movies endpoint to this controller
@CrossOrigin(origins ="*")
public class MovieController {

    @Autowired  // Injects an instance of MovieService into this controller
    private MovieService movieService;  // The service that provides movie data

    //Handles GET requests to /api/v1/movies endpoint.@return a ResponseEntity containing a list of movies and an HTTP status code

    @GetMapping  // Maps GET requests to this method
       // The method returns a ResponseEntity that wraps a List of Movie objects.
    public ResponseEntity<List<Movie>> getAllMovies(){
        // Calls the MovieService's allMovie method to get the list of all movies
        List<Movie> movies = movieService.allMovies();
        // Returns the list of movies wrapped in a ResponseEntity with an HTTP status of OK (200)
        return new ResponseEntity<List<Movie>>(movies, HttpStatus.OK);
    }


  @GetMapping("/{imdbId}")
  public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbId){
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(imdbId),HttpStatus.OK);
  }
}
