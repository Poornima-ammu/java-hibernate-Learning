package com.poorinma.MyHibernateLearning.mapping.ManytoOne;
import jakarta.persistence.*;
import java.util.*;

@Entity
public class Department {
	@Id
	private int deptid;
	private String dname;
	@OneToMany 
	private List<Employee> emp;
	/**
	 * @return the deptid
	 */
	public int getDeptid() {
		return deptid;
	}
	/**
	 * @param deptid the deptid to set
	 */
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	/**
	 * @return the dname
	 */
	public String getDname() {
		return dname;
	}
	/**
	 * @param dname the dname to set
	 */
	public void setDname(String dname) {
		this.dname = dname;
	}
	/**
	 * @return the emp
	 */
	public List getEmp() {
		return emp;
	}
	/**
	 * @param emp the emp to set
	 */
	public void setEmp(List emp) {
		this.emp = emp;
	}
}
