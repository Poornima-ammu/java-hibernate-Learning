package com.poorinma.MyHibernateLearning.mapping;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Student {
	@Id
	private  int rollno;
	private String sname;
	private int age;
	@ManyToMany(mappedBy="student")
	private List<Course>course;
	/**
	 * @return the rollno
	 */
	public int getRollno() {
		return rollno;
	}
	/**
	 * @param rollno the rollno to set
	 */
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	/**
	 * @return the sname
	 */
	public String getSname() {
		return sname;
	}
	/**
	 * @param sname the sname to set
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the course
	 */
	public List<Course> getCourse() {
		return course;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(List<Course> course) {
		this.course = course;
	}
}
