package com.fdmgroup.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "JPAEXAM_PRIVATE")
public class Private extends Soldier {

	@Column(name = "pUnitNum")
	private int pUnitNum;

	public Private() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Private(int sID, String sName, String sRank, int pUnitNum) {
		super(sID, sName, sRank);
		this.pUnitNum = pUnitNum;
	}

	public int getpUnitNum() {
		return pUnitNum;
	}

	public void setpUnitNum(int pUnitNum) {
		this.pUnitNum = pUnitNum;
	}

	@Override
	public String toString() {
		return "Private [pUnitNum=" + pUnitNum + ", getpUnitNum()=" + getpUnitNum() + ", getsID()=" + getsID()
				+ ", getsName()=" + getsName() + ", getsRank()=" + getsRank() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	
	
	
}
