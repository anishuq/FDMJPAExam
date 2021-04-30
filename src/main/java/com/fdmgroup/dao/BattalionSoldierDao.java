package com.fdmgroup.dao;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.fdmgroup.model.Battalion;




public class BattalionSoldierDao {

	DBConnection connection;
	EntityManager em;
	
	public BattalionSoldierDao() {
		connection = DBConnection.getInstance();
	}
	
	public void displayBattalionByName(String bName) {
		em = connection.getEntityManager();
		em.getTransaction().begin();
		
		Query q = em.createNamedQuery("Battalion.findByBName");
		q.setParameter("bName", bName);

		
		Battalion b = (Battalion) q.getSingleResult();
		
		System.out.println("Battalion name: "+b.getbName());
		
		em.close();
	}
}
