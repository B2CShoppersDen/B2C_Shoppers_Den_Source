package com.shoppersDen.controllers;

public class AdminController {
	
	public void Verification(String userName,String password)
	{
		AdminLoginModel adminLoginModel=new AdminLoginModel();
		adminLoginModel.setAdminName(userName);
		adminLoginModel.setAdminPassword(password);
		AdminService_Imp userService=new AdminService_Imp();
		try {
			boolean userVal=userService.adminVerification(adminLoginModel);
			
		}
	}
}
