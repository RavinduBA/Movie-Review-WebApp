package com.ravindu2.movie;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Repository interface for Movie entities.
 * It extends MongoRepository to provide CRUD operations on Movie documents in the MongoDB database.
 */
@Repository  // Indicates that this interface is a Spring Data repository,
             // making it a Spring-managed bean and eligible for dependency injection
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {


      Optional<Movie> findMovieByImdbId(String imdbId);


}
