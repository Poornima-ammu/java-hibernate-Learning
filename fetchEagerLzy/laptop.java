package com.poorinma.MyHibernateLearning.fetchEagerLzy;
import jakarta.persistence.*;
@Entity
public class laptop {
	@Id
	private int lapId;
	private String lapName;
	 @ManyToOne

	private Alien a1;
	/**
	 * @return the lapId
	 */
	public int getLapId() {
		return lapId;
	}
	@Override
	public String toString() {
		return "laptop [lapId=" + lapId + ", lapName=" + lapName + ", a1=" + a1 + "]";
	}
	/**
	 * @param lapId the lapId to set
	 */
	public void setLapId(int lapId) {
		this.lapId = lapId;
	}
	/**
	 * @return the lapName
	 */
	public String getLapName() {
		return lapName;
	}
	/**
	 * @param lapName the lapName to set
	 */
	public void setLapName(String lapName) {
		this.lapName = lapName;
	}
	/**
	 * @return the lapRamSize
	 */
	/**
	 * @return the a1
	 */
	public Alien getA1() {
		return a1;
	}
	/**
	 * @param a1 the a1 to set
	 */
	public void setA1(Alien a1) {
		this.a1 = a1;
	}
}
