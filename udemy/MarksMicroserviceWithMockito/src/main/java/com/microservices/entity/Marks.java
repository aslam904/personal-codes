package com.microservices.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class Marks {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private int mId;
	private int Tamil;
	private int English;
	private int Maths;
	private int Science;
	private int Social;
	private String C3StatusCodes;
	
	public String getC3StatusCodes() {
		return C3StatusCodes;
	}

	public void setC3StatusCodes(String c3StatusCodes) {
		C3StatusCodes = c3StatusCodes;
	}

	public Marks() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Marks(int mId, int tamil, int english, int maths, int science, int social) {
		super();
		this.mId = mId;
		Tamil = tamil;
		English = english;
		Maths = maths;
		Science = science;
		Social = social;
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public int getTamil() {
		return Tamil;
	}

	public void setTamil(int tamil) {
		Tamil = tamil;
	}

	public int getEnglish() {
		return English;
	}

	public void setEnglish(int english) {
		English = english;
	}

	public int getMaths() {
		return Maths;
	}

	public void setMaths(int maths) {
		Maths = maths;
	}

	public int getScience() {
		return Science;
	}

	public void setScience(int science) {
		Science = science;
	}

	public int getSocial() {
		return Social;
	}

	public void setSocial(int social) {
		Social = social;
	}

	@Override
	public String toString() {
		return "Marks [mId=" + mId + ", Tamil=" + Tamil + ", English=" + English + ", Maths=" + Maths + ", Science="
				+ Science + ", Social=" + Social + "]";
	}
	
	
	
	
}
