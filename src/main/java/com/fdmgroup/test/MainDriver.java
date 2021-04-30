package com.fdmgroup.test;


import java.util.Scanner;

import com.fdmgroup.dao.BattalionSoldierDao;

public class MainDriver {

	public static void main(String[] args) {
		BattalionSoldierDao battalionSoldierDao = new BattalionSoldierDao();
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter Battalion name:");
	    String batName = myObj.nextLine();
		
		battalionSoldierDao.displayBattalionByName(batName);
		

	}

}
