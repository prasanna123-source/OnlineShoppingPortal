package com.app.Entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment_mode")
public class PaymentMode {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer paymentModeId;

	@Column
	private String paymentModeName;

	public Integer getPaymentModeId() {
		return paymentModeId;
	}

	public void setPaymentModeId(Integer paymentModeId) {
		this.paymentModeId = paymentModeId;
	}

	public String getPaymentModeName() {
		return paymentModeName;
	}

	public void setPaymentModeName(String paymentModeName) {
		this.paymentModeName = paymentModeName;
	}

	public PaymentMode(Integer paymentModeId, String paymentModeName) {
		super();
		this.paymentModeId = paymentModeId;
		this.paymentModeName = paymentModeName;
	}

	public PaymentMode() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
