package com.poornima.MyHibernateLearning;
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
	@Table(name="alien_table")
	public class Alien {
		@Id
		@GeneratedValue
		private int aid;
		
		//@Transient
		private String aname;
	@Column(name="alien_color")
	private String color;
	@Temporal(TemporalType.DATE)
	private Date DOB;
		/**
		 * @return the aid
		 */
		public int getAid() {
			return aid;
		}
		@Override
		public String toString() {
			return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + ", DOB=" + DOB + "]";
		}
		/**
		 * @return the dOB
		 */
		public Date getDOB() {
			return DOB;
		}
		/**
		 * @param dOB the dOB to set
		 */
		public void setDOB(Date dOB) {
			DOB = dOB;
		}
		/**
		 * @param aid the aid to set
		 */
		public void setAid(int aid) {
			this.aid = aid;
		}
		/**
		 * @return the aname
		 */
		public String getAname() {
			return aname;
		}
		/**
		 * @param aname the aname to set
		 */
		public void setAname(String aname) {
			this.aname = aname;
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



