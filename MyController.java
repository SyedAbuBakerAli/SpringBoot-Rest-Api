package com.example.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springrest.Service.MoviesService;
import com.example.springrest.entities.Movies;



@RestController
public class MyController {
	
	@Autowired()
	private MoviesService moviesService;
	
	//Get the movies
	@GetMapping("/movies")
	public List<Movies> getMovies(){
		return this.moviesService.getMovies();
	}
	
	@GetMapping("/movies/{movieId}")
	public Movies getMovie(@PathVariable String movieId) {
		return this.moviesService.getMovie(Long.parseLong(movieId));
	}
	
	@PostMapping("/movies")
	public Movies addMovie(@RequestBody Movies movie) {
		
		return this.moviesService.addMovie(movie);
	}
	
	@PutMapping("/movies/{movieId}")
	public Movies updateMovie(@RequestBody Movies movie,@PathVariable("movieId")long movieId) {
		return this.moviesService.updateMovie(movie,movieId);	}
	
	@DeleteMapping("/movies/{movieId}")
	public Movies deleteMovie(@RequestBody Movies movie,@PathVariable("movieId")long movieId) {
		 return this.moviesService.deleteMovie(movie,movieId);
	}

}
