package com.spring.movietvapi.Controller;

import com.spring.movietvapi.Entities.SearchResults;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SearchController {
    @RequestMapping("/new")
    public SearchResults SearchTitle(@RequestParam("search") String searchtitle) {
        String api_key = "5c902a2f81b4919088e86511e8246ff9";
        final String uri = "https://api.themoviedb.org/3/search/multi?api_key="+api_key+"&language=en-US&query="+searchtitle+"&page=1&include_adult=false";

        RestTemplate restTemplate = new RestTemplate();
        SearchResults searchResults = restTemplate.getForObject(uri, SearchResults.class);

        return searchResults;
    }
}
