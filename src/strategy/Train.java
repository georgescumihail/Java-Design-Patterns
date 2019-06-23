package strategy;

public class Train implements ITransportMethod{

	@Override
	public void travel(String name) {
		
		System.out.println("Client " + name + " will arrive by train");
	}

}
