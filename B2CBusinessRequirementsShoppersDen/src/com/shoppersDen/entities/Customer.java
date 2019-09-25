package com.shoppersDen.entities;

public class Customer extends User {

	public Customer() {
		super();
		// TODO Auto-generated constructor stub

	}
	public String securityQuestion;
	public String securityAnswer;
	
	public String getSecurityQuestion() {
		return securityQuestion;
	}
	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}
	public String getSecurityAnswer() {
		return securityAnswer;
	}
	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}
	
}
