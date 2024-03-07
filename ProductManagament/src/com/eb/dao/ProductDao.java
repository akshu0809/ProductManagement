package com.eb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.eb.database.CP;
import com.eb.pojo.Product;

public class ProductDao {

	public static boolean insertProductData(Product p)
	{
		try {
			
			@SuppressWarnings("unused")
			boolean f=false;
			Connection conn=CP.createc();
	         
			String query="insert into product(pname,prise,quantity)values(?,?,?)";
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setString(1, p.getProductName());
			ps.setInt(2, p.getProductPrise());
			ps.setInt(3, p.getProductQuantity());
		    ps.executeUpdate();
		    f=true;
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
    public static boolean updateProductData() 
    {
    	
		boolean f=false;
    	try {
    		Connection conn=CP.createc();
    		Scanner sc=new Scanner(System.in);
    		System.out.println("Enter product id which u want to update:");
			int id=sc.nextInt();
			
			System.out.println("Enter product name which u want to update:");
			String name=sc.next();
			
			System.out.println("Enter product prise which u want to update:");
			int prise=sc.nextInt();
			
			System.out.println("Enter product quantity which u want to update:");
			int qty=sc.nextInt();
			
			String query="update product set pname='"+name+"',prise='"+prise+"',quantity='"+qty+"'where pid="+id;
			PreparedStatement ps=conn.prepareStatement(query);
			ps.executeUpdate();
			f=true;
    	}	
    	
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return false;
    }
    
    public static boolean deleteProductData(int userId) 
    {
    	@SuppressWarnings("unused")
		boolean f=false;
    	try {
    		Connection conn=CP.createc();
    		String query="delete from product where pid=?";
    		PreparedStatement ps=conn.prepareStatement(query);
			ps.setInt(1, userId);
		    ps.executeUpdate();
		    f=true;
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	return false;
    }
    public static void showAllProductData()
    {
    	@SuppressWarnings("unused")
		boolean f=false;
    	try {
    		Connection conn=CP.createc();
    		
    		String query="select * from product";
    		Statement st=conn.createStatement();
    		ResultSet rs=st.executeQuery(query);
    		
    		while(rs.next()) {
    			int id=rs.getInt(1);
    			String name=rs.getString(2);
    			int price=rs.getInt(3);
    			int quant=rs.getInt(4);
    			System.out.println("Product Id:"+id+"\nProduct Name:"+name+"\nProduct Price:"+price+"\nProduct Quantity:"+quant);
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
	
	
}
