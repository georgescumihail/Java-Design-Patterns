package ro.georgescumihail.designpatterns.template;

public class OrderBurger extends AbstractOrder{

	private int size;
	
	public OrderBurger(int size) {
		
		this.size = size;
	}
	
	@Override
	public void prepareIngredients() {
	
		System.out.println("Ingredients prepared for burger of size " + size);
		
	}

	@Override
	public void cook() {
		
		System.out.println("Burger of size " + size + " was cooked");
		
	}

	@Override
	public void deliver() {
		
		System.out.println("Burger of size " + size + " delivered");
		
	}
	

}
