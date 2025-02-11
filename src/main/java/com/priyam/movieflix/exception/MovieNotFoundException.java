package com.priyam.movieflix.exception;

public class MovieNotFoundException extends RuntimeException {
    public MovieNotFoundException(Long movie_id) {
    }
}
