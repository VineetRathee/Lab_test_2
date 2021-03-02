package com.customerapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;


import com.customerapp.exceptions.CustomerNotFoundException;
import com.customerapp.exceptions.DataAccessException;

public class CustomerDaoImpl implements CustomerDao{
	
	private Connection connection;
	
	public CustomerDaoImpl() {
		connection = ConnectionFactory.getConnection();
	}

	
	@Override
	public void addCustomer(Customer customer) {
		Date date = customer.getDob();
		java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		
		try {
			PreparedStatement pstmt = connection.prepareStatement("insert into CustomerTable(name,address,phone,dob) values(?,?,?,?)");
			pstmt.setString(1, customer.getName());
			pstmt.setString(2, customer.getAddress());
			pstmt.setString(3, customer.getPhone());
			pstmt.setDate(4, sqlDate);
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			throw new DataAccessException(e.getCause().getMessage());
		}
	}

	@Override
	public Customer getCustomerById(int id) {
		Customer customer = null;
		try {
			
			PreparedStatement pstmt = connection.prepareStatement("select * from CustApp where id=?");
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				customer = new Customer(rs.getInt("id"),
						rs.getString("name"), 
						rs.getString("address"), 
						rs.getString("phone"),
						new java.util.Date(rs.getDate("dob").getTime()));
			}
			
			if(customer != null) {
				return customer;
			}else {
				throw new CustomerNotFoundException("Customer of id " + id + " not found");
			}
			
			
		} catch (SQLException e) {
			throw new DataAccessException(e.getCause().getMessage());
		}
	}
	
	
}
