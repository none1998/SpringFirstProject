package springproject.first.repository;

import org.springframework.data.repository.CrudRepository;
import springproject.first.model.Movie;

public interface MovieRepository extends CrudRepository<Movie, Integer> {

}
