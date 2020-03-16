package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.Entitys.PaymentMode;

@Repository
public interface PaymentModeRepository extends JpaRepository<PaymentMode,Integer>{

}
