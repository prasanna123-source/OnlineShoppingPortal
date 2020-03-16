package com.app.serviceImpl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Entitys.Cart;
import com.app.Entitys.CartItem;
import com.app.Entitys.Product;
import com.app.repositories.CartRepository;
import com.app.repositories.DeliveryModeRepository;
import com.app.repositories.PaymentModeRepository;
import com.app.repositories.ProductRepository;
import com.app.repositories.PurchaseRepository;
import com.app.repositories.UserRepository;
import com.app.Models.ProductAndQuantity;
import com.app.Models.ProductToCartRequest;
import com.app.services.ShoppingPortalService;

@Service
public class ShoppingPortalServiceImpl implements ShoppingPortalService{
	
	@Autowired
	CartRepository cartRepository;
	
	@Autowired
	DeliveryModeRepository deliveryModeRepository;
	
	@Autowired
	PaymentModeRepository paymentModeRepository;
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	PurchaseRepository purchaseRepository;
	
	@Autowired
	UserRepository userRepository;

	
	@Override
	public List<Product> getElectronicsProducts(List<Product> products) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ConfirmPurchase() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void purchaseHistory(Integer userId) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void addElectronicsItemToCart(ProductToCartRequest request) {
		Cart cart = new Cart();

//		cart.setUpdatedOn(dateTime.format(new java.util.Date()));

		List<Integer> iProdIds = request.getProductsList().stream().map(ProductAndQuantity::getProductId)
				.collect(Collectors.toList());
		System.out.println("iProdIds :=================="+iProdIds);
		List<Product> productsList = productRepository.findByProductIdIn(iProdIds);
		System.out.println("products list :=================="+productsList);

		Map<Integer, Double> prodPricesMap = productsList.stream()
				.collect(Collectors.toMap(Product::getProductId, Product::getPrice));
		System.out.println("prodPricesMap .. :=================="+prodPricesMap);
		
		List<ProductAndQuantity> prodAndQty = request.getProductsList();

		List<CartItem> cartProdList = new ArrayList<>();
		prodAndQty.stream().forEach(prodQty -> {
			CartItem cartProd = new CartItem();
			cartProd.setTotalPrice(prodPricesMap.get(prodQty.getProductId()) * prodQty.getQuantity());
			cartProd.setQuantity(prodQty.getQuantity());
			cartProd.setProductId(prodQty.getProductId());
			cartProdList.add(cartProd);
		});

		cart.setCartItems(cartProdList);

		cartRepository.saveAndFlush(cart);
		
	}

}
