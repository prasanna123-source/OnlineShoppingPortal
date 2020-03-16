package com.app.Entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "purchase")
public class Purchase {
	
	@Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
	private Integer purchaseId;
	
	
	@ManyToOne(fetch=FetchType.LAZY ,optional=false)
	@JoinColumn(name="paymentModeId")
	@JsonBackReference
	private PaymentMode paymentMode;
	
	
	@ManyToOne(fetch=FetchType.LAZY ,optional=false)
	@JoinColumn(name="deliveryModeId")
	@JsonBackReference
	private DeliveryMode deliveryMode;
	
	@Column
	private String purchaseOn;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "cart_id")
	@JsonBackReference
	private Cart cart;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	@JsonBackReference
	private User user;

	public long getPurchaseId() {
		return purchaseId;
	}
    
	
	public PaymentMode getPaymentMode() {
		return paymentMode;
	}


	public void setPurchaseId(Integer purchaseId) {
		this.purchaseId = purchaseId;
	}


	public void setPaymentMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}

	public DeliveryMode getDeliveryMode() {
		return deliveryMode;
	}

	public void setDeliveryMode(DeliveryMode deliveryMode) {
		this.deliveryMode = deliveryMode;
	}

	public String getPurchaseOn() {
		return purchaseOn;
	}

	public void setPurchaseOn(String purchaseOn) {
		this.purchaseOn = purchaseOn;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Purchase(Integer purchaseId, PaymentMode paymentMode, DeliveryMode deliveryMode, String purchaseOn, Cart cart,
			User user) {
		super();
		this.purchaseId = purchaseId;
		this.paymentMode = paymentMode;
		this.deliveryMode = deliveryMode;
		this.purchaseOn = purchaseOn;
		this.cart = cart;
		this.user = user;
	}

	public Purchase() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	}
	
	
    

