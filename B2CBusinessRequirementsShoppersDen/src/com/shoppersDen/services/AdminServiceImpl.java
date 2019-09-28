package com.shoppersDen.services;

import com.shoppersDen.models.AdminLoginModel;
import com.shoppersDen.repository.AdminRepository;

public class AdminServiceImpl implements AdminService {
	
		AdminRepository admin1=new AdminRepository();
		
		public boolean adminVerification(AdminLoginModel adminLoginModel) {
			
		// TODO Auto-generated method stub
		if(adminLoginModel.getAdminName().equals("Sahithi")&&adminLoginModel.getAdminPassword().equals("reddy"))
		{	
			return true;
		}
			return false;
	}
}


