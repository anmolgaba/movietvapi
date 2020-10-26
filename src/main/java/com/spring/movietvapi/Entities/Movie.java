package com.spring.movietvapi.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.lang.Nullable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie {
    private boolean adult;
    @Nullable
    private String backdrop_path;
    private Long budget;
    //private genres
    @Nullable
    private String homepage;
    private long id;
    @Nullable
    private long imdb_id;
    private String original_language;
    private String original_title;
    @Nullable
    private String overview;
    private float popularity;
    @Nullable
    private String poster_path;
    //production_companies
    //production_countries
    private String release_date;
    private Long revenue;
    @Nullable
    private int runtime;
    //spoken_languages
    private String status;
    @Nullable
    private String tagline;
    private String title;
    private boolean video;
    private int vote_count;
    private float vote_average;

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    @Nullable
    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(@Nullable String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public Long getBudget() {
        return budget;
    }

    public void setBudget(Long budget) {
        this.budget = budget;
    }

    @Nullable
    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(@Nullable String homepage) {
        this.homepage = homepage;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getImdb_id() {
        return imdb_id;
    }

    public void setImdb_id(long imdb_id) {
        this.imdb_id = imdb_id;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    @Nullable
    public String getOverview() {
        return overview;
    }

    public void setOverview(@Nullable String overview) {
        this.overview = overview;
    }

    public float getPopularity() {
        return popularity;
    }

    public void setPopularity(float popularity) {
        this.popularity = popularity;
    }

    @Nullable
    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(@Nullable String poster_path) {
        this.poster_path = poster_path;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public Long getRevenue() {
        return revenue;
    }

    public void setRevenue(Long revenue) {
        this.revenue = revenue;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Nullable
    public String getTagline() {
        return tagline;
    }

    public void setTagline(@Nullable String tagline) {
        this.tagline = tagline;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isVideo() {
        return video;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }

    public int getVote_count() {
        return vote_count;
    }

    public void setVote_count(int vote_count) {
        this.vote_count = vote_count;
    }

    public float getVote_average() {
        return vote_average;
    }

    public void setVote_average(float vote_average) {
        this.vote_average = vote_average;
    }
}
