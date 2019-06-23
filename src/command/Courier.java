package command;

import java.util.ArrayList;

public class Courier {

	private String name;
	private ArrayList<IDelivery> deliveries;
	
	public Courier(String name) {

		this.name = name;
		this.deliveries = new ArrayList<>();
	}
	
	public void addDelivery(IDelivery d) {
		
		deliveries.add(d);
	}
	
	public void sendDeliveries() {
		
		for(IDelivery d : deliveries) {
			
			d.send();
		}
		
		deliveries.clear();
	}
}
