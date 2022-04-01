package com.example.springrest.Service;

import java.util.List;

import com.example.springrest.entities.Movies;

public interface MoviesService {
          
	public List<Movies> getMovies();
	
	public Movies getMovie(long movieId);
	
	public Movies addMovie(Movies movie);
	
	public Movies updateMovie(Movies movie,long movieId);
	
	public Movies deleteMovie(Movies movie,long movieId);
}
