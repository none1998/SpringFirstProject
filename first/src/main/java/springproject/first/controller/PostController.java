package springproject.first.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springproject.first.model.Movie;
import springproject.first.repository.MovieRepository;
import springproject.first.service.FetchDataService;

import java.util.List;
import java.util.Optional;

@Controller
public class PostController{
    @Autowired
    FetchDataService fetchDataService;
    @Autowired
    private MovieRepository movieRepository;

    @RequestMapping(value = "/movies")
    public String getMovies(Model model){
        List<Movie> movies = fetchDataService.findAll();
        model.addAttribute("movies",movies);
        return "movies";
    }

    @GetMapping("/create")
    public String createForm(Model model) {
        model.addAttribute("movie", new Movie());
        return "greeting";
    }

    @PostMapping("/result")
    @Transactional
    public Movie saveMovie(Movie movie) {
        Movie movieresponse = movieRepository.save(movie);
        return movieresponse;
    }

    @GetMapping(value = "/movies/id")
    public String getMovie(Model model, @RequestParam(value = "id") int id){
        Movie m = fetchDataService.findOneById(id);
        model.addAttribute("m",m);
        return "movie";
    }
}