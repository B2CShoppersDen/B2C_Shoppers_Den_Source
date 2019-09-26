package com.shoppersDen.ui;

import java.util.Scanner;

import com.shoppersDen.views.AdminLoginView;
import com.shoppersDen.views.CustomerLoginView;

public class UI {

	public static void main(String[] args) {
		System.out.println("Enter 1 if you are an Admin");
		System.out.println("Enter 2 if you are a Customer");
		System.out.println("Enter Your Option");
		
		Scanner in = new Scanner(System.in);
		//InputStreamReader reader=
		//				new InputStreamReader(System.in);
		//BufferedReader buffer=new BufferedReader(reader);
		int option=in.nextInt();
		
		switch(option)
		{
		case 1: AdminLoginView adminLoginView=new AdminLoginView();
		adminLoginView.mainAdminView();
		break;
		case 2: CustomerLoginView customerLoginView=new CustomerLoginView();
		customerLoginView.mainCustomerView();
		break;
		}
	}
}
