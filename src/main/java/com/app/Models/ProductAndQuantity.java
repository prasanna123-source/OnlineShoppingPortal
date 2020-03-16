package com.app.Models;

public class ProductAndQuantity {
	private Integer productId;
	private int quantity;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public ProductAndQuantity(Integer productId, int quantity) {
		super();
		this.productId = productId;
		this.quantity = quantity;
	}

	public ProductAndQuantity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
