package com.poorinma.MyHibernateLearning.fetchEagerLzy;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Transient;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.OneToMany;
import java.util.*;



import jakarta.persistence.GeneratedValue;
import java.util.Date;


@Entity

public class Alien {
    @OneToMany(mappedBy = "a1")

	private List<laptop> lapi;
	@Id
	private int aid;
	private String color;
	
	/**
	 * @return the aname
	 */

	/**
	 * @return the aid
	 */
	public int getAid() {
		return aid;
	}
	/**
	 * @return the lapi
	 */

	
	/**
	 * @param aid the aid to set
	 */
	public void setAid(int aid) {
		this.aid = aid;
	}
	/**
	 * @return the lapi
	 */
	public List<laptop> getLapi() {
		return lapi;
	}


	/**
	 * @param lapi the lapi to set
	 */
	public void setLapi(List<laptop> lapi) {
		this.lapi = lapi;
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
	@Override
	public String toString() {
	    return "Alien [aid=" + aid + ", color=" + color + "]";
	}
	
	
	

}
