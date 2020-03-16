package com.app.Entitys;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart implements Serializable  {
	
	private static final long serialVersionUID = 518274023688852025L;
	
	@Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
	@Column(name="cartId")
    private Integer cartId;
	
	@Column(name="grandTotal")
	private double grandTotal;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "cart_id")
	private List<CartItem> cartItems;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "userId")	
//	private User user;	
//	
	
	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}

//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}

	public double getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}

	public Cart(Integer cartId, double grandTotal, List<CartItem> cartItems, User user) {		
		this.cartId = cartId;
		this.grandTotal = grandTotal;
		this.cartItems = cartItems;
//		this.user = user;
	}

	public Cart() {	
	}		
     
}
