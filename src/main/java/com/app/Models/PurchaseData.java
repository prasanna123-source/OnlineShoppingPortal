package com.app.Models;

import java.util.List;

public class PurchaseData {

	private String orderPlacedOn;
	private String paymentMode;
	private String deliveryMode;
	private List<CartProductData> cartProducts;
	public String getOrderPlacedOn() {
		return orderPlacedOn;
	}
	public void setOrderPlacedOn(String orderPlacedOn) {
		this.orderPlacedOn = orderPlacedOn;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getDeliveryMode() {
		return deliveryMode;
	}
	public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
	}
	public List<CartProductData> getCartProducts() {
		return cartProducts;
	}
	public void setCartProducts(List<CartProductData> cartProducts) {
		this.cartProducts = cartProducts;
	}
	public PurchaseData(String orderPlacedOn, String paymentMode, String deliveryMode,
			List<CartProductData> cartProducts) {
		super();
		this.orderPlacedOn = orderPlacedOn;
		this.paymentMode = paymentMode;
		this.deliveryMode = deliveryMode;
		this.cartProducts = cartProducts;
	}
	public PurchaseData() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PurchaseData [orderPlacedOn=" + orderPlacedOn + ", paymentMode=" + paymentMode + ", deliveryMode="
				+ deliveryMode + ", cartProducts=" + cartProducts + "]";
	}
	
}
