package ro.georgescumihail.designpatterns.proxy;

public class TestProxy {

	public static void main(String[] args) {
	
		IShop shop = new Shop("Militari Shop");
		IShop proxyShop = new ShopProxy(shop);
		
		Product prod1 = new Product("Samsung Galaxy S8", 25);
		Product prod2 = new Product("Nokia 3310", 5);
		Product prod3 = new Product("iPhone 5", 75);
		
		proxyShop.repair(prod1);
		proxyShop.repair(prod2);
		proxyShop.repair(prod3);
	}

}
