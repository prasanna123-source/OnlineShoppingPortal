package com.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.Entitys.Purchase;
import com.app.Entitys.User;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {
	
	List<Purchase> findByUser(User user);
}
