package template;

public abstract class AbstractOrder {

	public abstract void prepareIngredients();
	public abstract void cook();
	public abstract void deliver();
	
	public final void createOrder() {
		
		prepareIngredients();
		cook();
		deliver();
		
	}
}
