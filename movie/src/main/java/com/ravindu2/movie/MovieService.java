package com.ravindu2.movie;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

/**
 * Service class that contains business logic for movie-related operations..
 */
@Service  // Marks this class as a Spring service component,
          // making it eligible for component scanning and dependency injection
public class MovieService {

    @Autowired  // Injects an instance of MovieRepository into this service
    private MovieRepository movieRepository;  // The repository that interacts with the database to perform CRUD operations on Movie entities

    /**
     * Retrieves a list of all movies from the database.
     * @return a list of Movie objects
     */
    public List<Movie> allMovies(){
        // Calls the findAll method of the MovieRepository to fetch all movies from the database
        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }


}
