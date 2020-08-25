package cl.kranio.entities;

import java.io.Serializable;

public class Game implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1638162779099427308L;
	
	public Game() {}
	
	public Game(int id, String name, String category, int year) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.year = year;
	}
	
	private int id;
	private String name;
	private String category;
	private int year;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}