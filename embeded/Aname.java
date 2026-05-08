package com.poornima.MyHibernateLearning.embeded;
import jakarta.persistence.*;
@Embeddable
public class Aname {
	@Column(name="first_name")
	private String fname;
	
	@Column(name="middle_name")
	private String mname;
	
	@Column(name="last_name")
	private String lname;

	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}

	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}

	/**
	 * @return the mname
	 */
	public String getMname() {
		return mname;
	}

	/**
	 * @param mname the mname to set
	 */
	public void setMname(String mname) {
		this.mname = mname;
	}

	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}

	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	

}
