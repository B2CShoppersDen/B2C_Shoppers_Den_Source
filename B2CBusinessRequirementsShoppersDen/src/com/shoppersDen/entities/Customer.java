package com.shoppersDen.entities;

public class Customer{
	
		private int customerId;
		private String customerUserName;
		private String customerPassword;
		private String firstName;
		private String lastName;
		private String email;
		private String phoneNumber;
		
		
		public int getCustomerId()
		{
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public String getCustomerUserName() {
			return customerUserName;
		}
		public void setCustomerUserName(String customerUserName) {
			this.customerUserName = customerUserName;
		}
		public String getCustomerPassword() {
			return customerPassword;
		}
		public void setCustomerPassword(String customerPassword) {
			this.customerPassword = customerPassword;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		@Override
		public String toString() {
			return "Customer [customerId=" + customerId + ", customerUserName=" + customerUserName
					+ ", customerPassword=" + customerPassword + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
		}
		
}
