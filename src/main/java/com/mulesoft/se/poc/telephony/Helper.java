package com.mulesoft.se.poc.telephony;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Helper {

	private static Cliente nial = new Cliente() {{ 
		setId("C1");
		setName("Nial Darbey");
		setPlans(new ArrayList<Plan>() {{ 
			add(new Plan() {{ 
				setId("P1");
				setName("");
				setDescription("");
				setType(PlanType.POST_PAGO);
			}});
		}});
	}};
	
	private static Plan planNial = new Plan() {{
		setId("P1");
		setName("");
		setDescription("");
		setType(PlanType.POST_PAGO);
	}};
		
	public static List<Cliente> getClientes() {
		List<Cliente> clientes = new ArrayList<Cliente>() {{
			add(nial);
		}};
		return clientes;
	}
	
	public static Cliente getCliente() {
		return nial;
	}
	
	public static List<Plan> getPlanes() {
		List<Plan> planes = new ArrayList<Plan>() {{
			add(new Plan() {{ 
				setId("P1");
				setName("");
				setDescription("");
				setType(PlanType.POST_PAGO);
			}});
		}};
		return planes;
	}
	
	public static Plan getPlan() {
		return planNial;
	}
	
	public static Factura getFactura() {
		Factura factura = new Factura() {{ 
			setId("F1");
			setCliente(nial);
			setValue(123.57);
			setDate("28 May 2013");
		}};
		return factura;
	}
}
