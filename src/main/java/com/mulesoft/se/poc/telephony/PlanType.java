package com.mulesoft.se.poc.telephony;

public enum PlanType {

	PRE_PAGO("Pre-pago"), POST_PAGO("Post-pago");
	
	private String name;
	
	private PlanType(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}
