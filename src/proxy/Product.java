package proxy;

public class Product {
	
	private String name;
	private int damagePercentage;
	
	public Product(String name, int damagePercentage) {

		this.name = name;
		this.damagePercentage = damagePercentage;
	}

	public String getName() {
		return name;
	}

	public int getDamagePercentage() {
		return damagePercentage;
	}

	
}
