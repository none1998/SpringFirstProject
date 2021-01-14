package springproject.first.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springproject.first.model.Movie;

import java.util.List;

@Repository
public interface FetchDataService extends JpaRepository<Movie,Integer> {
    @Override
    List<Movie> findAll();
    public Movie findOneById(int id);
}