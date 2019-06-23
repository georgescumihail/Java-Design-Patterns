package ro.georgescumihail.designpatterns.proxy;

public class ShopProxy implements IShop{

	private IShop realShop;
	
	public ShopProxy(IShop realShop) {

		this.realShop = realShop;
	}

	@Override
	public void repair(Product p) {
		
		if(p.getDamagePercentage() < 50) {
			realShop.repair(p);
		}
		else {
			System.out.println("The product " + p.getName() + " is too damaged to be repaired");
		}
	}

}
