package ro.georgescumihail.designpatterns.strategy;

public class Plane implements ITransportMethod {

	@Override
	public void travel(String name) {
		
		System.out.println("Client " + name + " will arrive by plane");
	}

}
