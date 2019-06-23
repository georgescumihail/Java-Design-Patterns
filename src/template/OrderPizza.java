package template;

public class OrderPizza extends AbstractOrder{

	private String name;
	
	public OrderPizza(String name) {
		
		this.name = name;
	}
	
	@Override
	public void prepareIngredients() {
	
		System.out.println("Ingredients prepared for pizza " + name);
		
	}

	@Override
	public void cook() {
		
		System.out.println("Pizza " + name + " was cooked");
		
	}

	@Override
	public void deliver() {
		
		System.out.println("Pizza " + name + " delivered");
		
	}

}
