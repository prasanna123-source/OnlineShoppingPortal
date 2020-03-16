package com.app.Models;

import java.util.List;

public class ProductToCartRequest {
	private int userId;

	private List<ProductAndQuantity> productsList;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public List<ProductAndQuantity> getProductsList() {
		return productsList;
	}

	public void setProductsList(List<ProductAndQuantity> productsList) {
		this.productsList = productsList;
	}

	public ProductToCartRequest(int userId, List<ProductAndQuantity> productsList) {
		super();
		this.userId = userId;
		this.productsList = productsList;
	}

	public ProductToCartRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ProductToCartRequest [userId=" + userId + "]";
	}
	
	
}
