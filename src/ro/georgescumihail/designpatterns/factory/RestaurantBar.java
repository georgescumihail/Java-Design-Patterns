package ro.georgescumihail.designpatterns.factory;

public class RestaurantBar extends AbstractRestaurant {

	private int ageLimit;
	
	public RestaurantBar(String name, int profit, int ageLimit) {
		
		super(name, profit);
		this.ageLimit = ageLimit;
	}

	@Override
	public void display() {
		
		System.out.println("The bar " + name +
				" has a profit of " + profit + " and accessible to people over " + ageLimit);
		
	}

}
