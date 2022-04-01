package com.example.springrest.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.springrest.entities.Movies;

@Service()
public class MoviesServiceImpl implements MoviesService{

	
	List<Movies> list;
	
	
	public MoviesServiceImpl() {
		list = new ArrayList<>();
		list.add(new Movies(001,"Bharat"));
		list.add(new Movies(002,"Tubelight"));
	}
	
	@Override
	public List<Movies> getMovies() {
		
		return list;
	}

	@Override
	public Movies getMovie(long movieId) {
		
		Movies m = null;
		
		for(Movies movie:list) {
			if(movie.getId()==movieId) {
				m = movie;
				break;
			}
		}
		
		return m;
	}

	@Override
	public Movies addMovie(Movies movie) {
		
		list.add(movie);
		return movie;
	}

	@Override
	public Movies updateMovie(Movies movie, long movieId) {
		
	         list = list.stream().map(b->{
	        	 if(b.getId()==movieId) {
	        		 b.setName(movie.getName());
	        	 }
	        	 return b;
	         }).collect(Collectors.toList());
	         return movie;
		
	}

	@Override
	public Movies deleteMovie(Movies movie,long movieId) {
		list = list.stream().filter(bo->{
			if(bo.getId()!=movieId) {
				return true;
			}else {
			     return	false;
			}
		}).collect(Collectors.toList());
	     return movie;	
	}
	
	

}
