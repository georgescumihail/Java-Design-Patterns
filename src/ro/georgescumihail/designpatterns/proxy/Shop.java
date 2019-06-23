package ro.georgescumihail.designpatterns.proxy;

public class Shop implements IShop {

	private String name;
	
	public Shop(String name) {

		this.name = name;
	}

	@Override
	public void repair(Product p) {
	
		System.out.println("The product " + p.getName() + " was repaired by " + name);
	}

}
