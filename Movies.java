package com.example.springrest.entities;

public class Movies {
	
	private long id;
	private String name;
	
	
	public Movies(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Movies [id=" + id + ", name=" + name + "]";
	}
	

}
