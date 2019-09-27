package com.shoppersDen.controllers;

import com.shoppersDen.models.AdminModel;

public class AdminController {
	
	public void adminAuthenication(String adminName, String password) {
		AdminModel adminModel=new AdminModel();
		adminModel.setUserName(adminName);
		adminModel.setPassword(password);
	
		
		
		
	}
	
	
}
