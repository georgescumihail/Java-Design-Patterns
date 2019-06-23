package ro.georgescumihail.designpatterns.strategy;

public class Car implements ITransportMethod {

	@Override
	public void travel(String name) {
		
		System.out.println("Client " + name + " will arrive by car");
	}

}
