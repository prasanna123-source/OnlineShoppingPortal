package com.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.Entitys.Product;

@Repository
public interface ProductRepository  extends JpaRepository<Product, Integer> {
	
    public List<Product> findByProductNameContainingIgnoreCase(String productName);
	
	public List<Product> findByProductNameContainingIgnoreCaseOrderByProductName(String productName);
	
	@Query(" where x.product in ?1")
	public List<Product> findByProductIdIn(List<Integer> productIds); 
}
