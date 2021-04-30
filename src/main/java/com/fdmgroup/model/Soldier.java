package com.fdmgroup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name="JPAEXAM_SOLDIER")
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Soldier {
	
	@Id
	@Column(name = "sID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "soldier_generator")
	@SequenceGenerator(name = "soldier_generator", sequenceName = "JPAEXAM_SOLDIER_SEQ")
	private int sID;
	
	@Column(name = "sNAME")
	private String sName;//Read only.
	
	@Column(name = "sRank")
	private String sRank;

	//@ManyToOne
	//@Column(name = "fk_bID")
	//private int fk_bID;
	
	public Soldier() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Soldier(int sID, String sName, String sRank) {
		super();
		this.sID = sID;
		this.sName = sName;
		this.sRank = sRank;
	}


	public int getsID() {
		return sID;
	}


	public void setsID(int sID) {
		this.sID = sID;
	}


	public String getsName() {
		return sName;
	}


	public String getsRank() {
		return sRank;
	}


	public void setsRank(String sRank) {
		this.sRank = sRank;
	}
	
	/*
	public int getFk_bID() {
		return fk_bID;
	}


	public void setFk_bID(int fk_bID) {
		this.fk_bID = fk_bID;
	}
	*/

	@Override
	public String toString() {
		return "Soldier [sID=" + sID + ", sName=" + sName + ", sRank=" + sRank + ", getsID()="
				+ getsID() + ", getsName()=" + getsName() + ", getsRank()=" + getsRank() + ", getFk_bID()="
				+  ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
