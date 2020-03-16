package com.app.services;

import java.util.List;

import com.app.Entitys.Product;
import com.app.Models.ProductToCartRequest;

public interface ShoppingPortalService {
	
	//add product to Cart service
	public void addElectronicsItemToCart(ProductToCartRequest request);
	
	//search products
	public List<Product> getElectronicsProducts(List<Product> products);
	
	//confirm purchase
	public void ConfirmPurchase();

	//purchase history
	public void purchaseHistory(Integer userId);
}
