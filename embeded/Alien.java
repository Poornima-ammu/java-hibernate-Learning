package com.poornima.MyHibernateLearning.embeded;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Transient;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


import jakarta.persistence.GeneratedValue;
import java.util.Date;


@Entity

public class Alien {
	@Id
	private Aname aname=new Aname();
	private int aid;
	private String color;
	/**
	 * @return the aname
	 */
	public Aname getAname() {
		return aname;
	}
	/**
	 * @param aname the aname to set
	 */
	public void setAname(Aname aname) {
		this.aname = aname;
	}
	/**
	 * @return the aid
	 */
	public int getAid() {
		return aid;
	}
	/**
	 * @param aid the aid to set
	 */
	public void setAid(int aid) {
		this.aid = aid;
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
