package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.Entitys.Cart;
import com.app.Entitys.DeliveryMode;

@Repository
public interface DeliveryModeRepository extends JpaRepository<DeliveryMode, Integer> {

}
