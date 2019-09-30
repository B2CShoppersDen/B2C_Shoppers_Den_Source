
package com.shoppersDen.dao;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	import javax.activation.DataSource;

	public class ShoppingCartDAOImpl implements ShoppingCartDAO{
		public String Item;
		@Override
		public void save(Item item) {
			String query="insert into Item(id,name,price,qty)values(?,?,?,?)";
			Connection con=null;
			PreparedStatement ps=null;
			
		}

		@Override
		public void displayAmount() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void displayCart() {
			// TODO Auto-generated method stub
			
		}
			

}
