package com.lvpeng.seller.dal.model;

import org.springframework.data.annotation.Id;

public class Delivery {

	@Id
	private String id;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}