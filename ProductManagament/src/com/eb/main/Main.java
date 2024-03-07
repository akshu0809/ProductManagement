package com.eb.main;

import java.util.Scanner;

import com.eb.dao.ProductDao;
import com.eb.pojo.Product;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to Online Shopping Portal");
		
		
		int ch=0;
		do {
			System.out.println("Press 1 Add Product");
			System.out.println("Press 2 Update Product");
			System.out.println("Press 3 Delete Product");
			System.out.println("Press 4 Read Product Records");
			System.out.println("Press 5 Exit");
			System.out.println("Enter Choice:");
			ch=sc.nextInt();
			switch(ch) {
			case 1: 
				System.out.println("Enter Product Name:");
			    String pname=sc.next();
			    
			    System.out.println("Enter Product price:");
			    int prise=sc.nextInt();
			    
			    System.out.println("Enter Product quantity:");
			    int quantity=sc.nextInt();
			    
			    Product pt=new Product(pname,prise,quantity);
			    boolean ans=ProductDao.insertProductData(pt);
			    System.out.println("Data inserted Successfully");
			break;
			case 2:
				ProductDao.updateProductData();
			break;
			case 3:
				System.out.println("Enter Id which u want delete:");
				
				int id=sc.nextInt();
				ProductDao.deleteProductData(id);
				System.out.println("Id is deleted");
			break;
			case 4:
				ProductDao.showAllProductData();
			break;
			case 5:
				System.out.println("Bye Bye");
			break;
			default:
				System.out.println("Wrong Choice");
			}
		}while(ch!=5);
	}


}


