package ro.georgescumihail.designpatterns.strategy;

public class TestStrategy {

	public static void main(String[] args) {
		
		Client client1 = new Client("Michael", new Car());
		client1.travel();
		
		client1.setTransportMethod(new Train());
		client1.travel();
		
		Client client2 = new Client("Alex", new Plane());
		client2.travel();
	}

}
