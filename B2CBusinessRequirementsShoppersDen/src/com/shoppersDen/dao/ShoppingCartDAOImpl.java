
package com.shoppersDen.dao;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	import javax.activation.DataSource;

	import com.shoppersDen.dao.Item;

	public class ShoppingCartDAOImpl implements ShoppingCartDAO {
		private  DataSource dataSource;
		public String item;
		
		public void setDataSource(DataSource dataSource) {
			this.dataSource=dataSource;
			

}
