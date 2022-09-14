package com.capg.exceptionhandler;

public class MovieNotFoundException extends ResourceNotFoundException {

	private static final long serialVersionUID = 1L;

	public MovieNotFoundException(int movieId) {
		super("Movie", "movie-id", movieId);
	}

	/*
	 * public Movies getMovietById(int flightId) {
	 *return movieRepo.findById(movieId).orElseThrow(() -> new MovieNotFoundException(movieId));
*/
}
