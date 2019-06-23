package factory;

import javax.naming.OperationNotSupportedException;

public class FactoryRestaurant {

	public static AbstractRestaurant createRestaurant(String name, int profit, EnumRestaurant type) throws OperationNotSupportedException {
		
		AbstractRestaurant newRestaurant;
		
		switch (type) {
		
		case FASTFOOD:
			
			newRestaurant = new RestaurantFastFood(name, profit, 7);
			break;
			
		case ELITE:
			
			newRestaurant = new RestaurantElite(name, profit, 10);
			break;
			
		case BAR:
			
			newRestaurant = new RestaurantBar(name, profit, 18);
			break;
			
		default:
			throw new OperationNotSupportedException();
		}
		
		return newRestaurant;
	}
}