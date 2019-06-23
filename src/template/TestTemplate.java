package template;

public class TestTemplate {

	public static void main(String[] args) {
		
		AbstractOrder pizza = new OrderPizza("Quattro Stagioni");
		AbstractOrder burger = new OrderBurger(5);
		
		pizza.createOrder();
		System.out.println("");
		burger.createOrder();
	}

}
