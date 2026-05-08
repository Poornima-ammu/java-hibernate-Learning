package com.poorinma.MyHibernateLearning.mapping.oneToone;
import jakarta.persistence.*;
import java.util.*;

@Entity
public class Person {
	@Id
	private int pid;
	private String name;
	private String email;
	@OneToOne(mappedBy="person")
	private PanCard pancard;
	/**
	 * @return the pid
	 */
	public int getPid() {
		return pid;
	}
	/**
	 * @param pid the pid to set
	 */
	public void setPid(int pid) {
		this.pid = pid;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the pancard
	 */
	public PanCard getPancard() {
		return pancard;
	}
	/**
	 * @param pancard the pancard to set
	 */
	public void setPancard(PanCard pancard) {
		this.pancard = pancard;
	}
	
	

}
