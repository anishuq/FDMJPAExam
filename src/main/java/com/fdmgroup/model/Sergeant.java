package com.fdmgroup.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "JPAEXAM_SERGEANT")
public class Sergeant extends Soldier {
	
	@Column(name = "pSgtNum")
	private int pSgtNum;

	public Sergeant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sergeant(int sID, String sName, String sRank, int pSgtNum) {
		super(sID, sName, sRank);
		this.pSgtNum = pSgtNum;
	}

	public int getpSgtNum() {
		return pSgtNum;
	}

	public void setpSgtNum(int pSgtNum) {
		this.pSgtNum = pSgtNum;
	}

	@Override
	public String toString() {
		return "Sergeant [pSgtNum=" + pSgtNum + ", getpSgtNum()=" + getpSgtNum() + ", getsID()=" + getsID()
				+ ", getsName()=" + getsName() + ", getsRank()=" + getsRank() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
