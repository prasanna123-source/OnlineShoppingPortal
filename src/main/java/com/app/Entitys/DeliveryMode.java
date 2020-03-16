package com.app.Entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="delivery_mode")
public class DeliveryMode {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer deliveryModeId;

	@Column
	private String deliveryModeName;
    
	
	public Integer getDeliveryModeId() {
		return deliveryModeId;
	}


	public void setDeliveryModeId(Integer deliveryModeId) {
		this.deliveryModeId = deliveryModeId;
	}


	public String getDeliveryModeName() {
		return deliveryModeName;
	}


	public void setDeliveryModeName(String deliveryModeName) {
		this.deliveryModeName = deliveryModeName;
	}
	
	
	public DeliveryMode() {
		super();		
	}

	public DeliveryMode(Integer deliveryModeId, String deliveryModeName) {
		super();
		this.deliveryModeId = deliveryModeId;
		this.deliveryModeName = deliveryModeName;
	}
	
	
}
