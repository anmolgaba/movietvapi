package com.spring.movietvapi.Controller;

import com.spring.movietvapi.Entities.UpcomingMovies;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UpcomingMoviesController {
    @RequestMapping("/movies/upcoming")
    public UpcomingMovies upcomingMovies() {
        String api_key = "5c902a2f81b4919088e86511e8246ff9";
        final String uri = "https://api.themoviedb.org/3/movie/upcoming?api_key="+api_key+"&language=en-US&page=1&region=IN";

        RestTemplate restTemplate = new RestTemplate();
        //omitting max and min dates
        UpcomingMovies upcomingMovies = restTemplate.getForObject(uri, UpcomingMovies.class);

        return upcomingMovies;
    }
}
