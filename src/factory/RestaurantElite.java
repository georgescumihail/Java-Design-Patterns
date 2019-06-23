package factory;

public class RestaurantElite extends AbstractRestaurant {

	private int rating;
	
	public RestaurantElite(String name, int profit, int rating) {
		
		super(name, profit);
		this.rating = rating;
		
	}

	@Override
	public void display() {
		
		System.out.println("The elite restaurant " + name + " has a profit of " + profit + " and the rating " + rating);
		
	}

}
