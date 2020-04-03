package com.elevysi.javaee.util;

import java.io.Serializable;

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5962550776144781608L;
	
	private int id;
	private String email;
	private String name;
	private String country;
	
	
	public User(int id, String email, String name, String country) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.country = country;
	}
	
	
	@Override
	public String toString() {
		return "Name="+this.name+", Email="+this.email+", Country="+this.country;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


}
