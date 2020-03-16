package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.Models.ProductToCartRequest;
import com.app.services.ShoppingPortalService;

@RestController
public class ShoppingPortalController {
	
	@Autowired
	ShoppingPortalService shoppingPortalService;
	
	@PostMapping("/addToCart")
	public ResponseEntity<String> addProductsToCart(@RequestBody ProductToCartRequest request) {
		shoppingPortalService.addElectronicsItemToCart(request);
		return new ResponseEntity<>("Product(s) added to cart successfully...", HttpStatus.OK);
	}

}
