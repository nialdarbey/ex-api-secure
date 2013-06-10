package com.mulesoft.se.poc.telephony;

import java.util.List;

public class Cliente {

	private String id;
	
	private String name;
	
	private List<Plan> plans;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Plan> getPlans() {
		return plans;
	}

	public void setPlans(List<Plan> plans) {
		this.plans = plans;
	}
}
