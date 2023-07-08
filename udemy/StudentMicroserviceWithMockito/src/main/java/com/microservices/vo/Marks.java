package com.microservices.vo;



public class Marks {

	private int mId;
	private int Tamil;
	private int English;
	private int Maths;
	private int Science;
	private int Social;
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
	
	public Marks(int mId, int tamil, int english, int maths, int science, int social) {
		super();
		this.mId = mId;
		Tamil = tamil;
		English = english;
		Maths = maths;
		Science = science;
		Social = social;
	}
	
	public Marks() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Marks [mId=" + mId + ", Tamil=" + Tamil + ", English=" + English + ", Maths=" + Maths + ", Science="
				+ Science + ", Social=" + Social + "]";
	}
	

}
