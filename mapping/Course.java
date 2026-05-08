package com.poorinma.MyHibernateLearning.mapping;
import jakarta.persistence.*;
import java.util.*;
@Entity
public class Course {
	@Id
	private int id;
	private String cname;
	private int credits;
	@ManyToMany
	private List<Student>student;
	/**
	 * @return the student
	 */
	public List<Student> getStudent() {
		return student;
	}
	/**
	 * @param student the student to set
	 */
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the cname
	 */
	public String getCname() {
		return cname;
	}
	/**
	 * @param cname the cname to set
	 */
	public void setCname(String cname) {
		this.cname = cname;
	}
	/**
	 * @return the credits
	 */
	public int getCredits() {
		return credits;
	}
	/**
	 * @param credits the credits to set
	 */
	public void setCredits(int credits) {
		this.credits = credits;
	}
}
