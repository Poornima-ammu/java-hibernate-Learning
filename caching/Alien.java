package com.poorinma.MyHibernateLearning.caching;
import jakarta.persistence.*;
@Entity
@Table(name="caching_table")
public class Alien {
	@Id
	private int id;
	private String name;
	private String color;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + ", color=" + color + "]";
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	

}
