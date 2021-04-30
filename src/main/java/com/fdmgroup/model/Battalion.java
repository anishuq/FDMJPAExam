package com.fdmgroup.model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name="JPAEXAM_BATTALION")
@NamedQueries({
	@NamedQuery(name="Battalion.FindAll", query="SELECT b FROM Battalion b"),
	@NamedQuery(name="Battalion.findByBName", query="SELECT b FROM Battalion b WHERE b.bName = :bName")
})
@Entity
public class Battalion {

	@Id
	@Column(name = "bID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "battalion_generator")
	@SequenceGenerator(name = "battalion_generator", sequenceName = "JPAEXAM_BATTALION_SEQ")
	private int bID;
	
	@Column(name = "bNAME")
	private String bName;
	
	//@OneToMany
	//private List<Soldier> soldiers;
	
	
	public Battalion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Battalion(int bID, String bName) {
		super();
		this.bID = bID;
		this.bName = bName;
		//this.soldiers = new LinkedList<Soldier>();
	}

	public int getbID() {
		return bID;
	}

	public void setbID(int bID) {
		this.bID = bID;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	/*
	public List<Soldier> getSoldiers() {
		return soldiers;
	}

	public void setSoldiers(List<Soldier> soldiers) {
		this.soldiers = soldiers;
	}
	
	public void addSoldier(Soldier s) {
		soldiers.add(s);
	}
	*/

	@Override
	public String toString() {
		return "Battalion [bID=" + bID + ", bName=" + bName + ", , getbID()=" + getbID()
				+ ", getbName()=" + getbName() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
}
