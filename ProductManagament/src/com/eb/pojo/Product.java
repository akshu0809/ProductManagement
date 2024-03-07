package com.eb.pojo;

public class Product {
	private int productid;
	private String productName;
	private int productPrise;
	private int productQuantity;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrise() {
		return productPrise;
	}
	public void setProductPrise(int productPrise) {
		this.productPrise = productPrise;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(String productName, int productPrise, int productQuantity) {
		super();
		this.productName = productName;
		this.productPrise = productPrise;
		this.productQuantity = productQuantity;
	}
	@Override
	public String toString() {
		return "ProductDao [productid=" + productid + ", productName=" + productName + ", productPrise=" + productPrise
				+ ", productQuantity=" + productQuantity + "]";
	}

}
