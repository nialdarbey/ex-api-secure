package com.mulesoft.se.poc.telephony;

public class Plan {

	private String id;
	
	private String name;
	
	private String description;
	
	private PlanType type;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public PlanType getType() {
		return type;
	}

	public void setType(PlanType type) {
		this.type = type;
	}
}
