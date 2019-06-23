package ro.georgescumihail.designpatterns.factory;

public abstract class AbstractRestaurant {

	protected String name;
	protected int profit;
	
	public AbstractRestaurant(String name, int profit) {
		super();
		this.name = name;
		this.profit = profit;
	}
	
	public abstract void display();
}
