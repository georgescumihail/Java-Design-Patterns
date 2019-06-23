package factory;

import javax.naming.OperationNotSupportedException;

public class TestFactory {

	public static void main(String[] args) throws OperationNotSupportedException {
		
		AbstractRestaurant fastfood = FactoryRestaurant.createRestaurant("McDonalds", 1000, EnumRestaurant.FASTFOOD);
		AbstractRestaurant elite = FactoryRestaurant.createRestaurant("La Madame", 50000, EnumRestaurant.ELITE);
		AbstractRestaurant bar = FactoryRestaurant.createRestaurant("Trei Betivi", 10, EnumRestaurant.BAR);
		
		fastfood.display();
		elite.display();
		bar.display();

	}


}
