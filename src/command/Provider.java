package command;

public class Provider {
	
	private String name;

	public Provider(String name) {

		this.name = name;
	}
	
	public void deliverNormal(int nrItems) {
		
		System.out.println(name + " provider sent a normal delivery of " + nrItems + " items");
	}

	public void deliverPremium(int nrItems) {
		
		System.out.println(name + " provider sent a premium delivery of " + nrItems + " items");
	}
	
}
