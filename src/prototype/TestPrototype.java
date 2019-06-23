package prototype;

public class TestPrototype {

	public static void main(String[] args) {
		
		Product prod1 = new Product(1, "Lays", 5.5f);
		Product prod2 = prod1.clone();
		Product prod3 = prod1.clone();
		
		prod1.setPrice(666);
		
		prod1.print();
		prod2.print();
		prod3.print();
	}

}
