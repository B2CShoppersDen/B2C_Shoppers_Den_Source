package com.shoppersDen.entities;

public class Product {

	private int productId;
	private ProductDetails productdetails;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public ProductDetails getProductdetails() {
		return productdetails;
	}
	public void setProductdetails(ProductDetails productdetails) {
		this.productdetails = productdetails;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productdetails=" + productdetails + "]";
	}
	
}
