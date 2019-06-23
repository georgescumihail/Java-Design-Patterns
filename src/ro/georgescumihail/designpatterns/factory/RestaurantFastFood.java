package ro.georgescumihail.designpatterns.factory;

public class RestaurantFastFood extends AbstractRestaurant{

	private int branchesNr;
	
	public RestaurantFastFood(String name, int profit, int nr) {
		
		super(name, profit);
		branchesNr = nr;
	}

	@Override
	public void display() {
		
		System.out.println("The fast food restaurant " + name + " has a profit of " + profit + " and " + branchesNr + " branches");
		
		
	}

}
