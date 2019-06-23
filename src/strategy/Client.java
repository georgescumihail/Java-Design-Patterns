package strategy;

public class Client {

	private String name;
	private ITransportMethod transportMethod;
	
	public Client(String name, ITransportMethod transportMethod) {

		this.name = name;
		this.transportMethod = transportMethod;
	}
	
	public void travel() {
		
		transportMethod.travel(name);
	}
	
	public void setTransportMethod(ITransportMethod transportMethod) {
		
		this.transportMethod = transportMethod;
	}
	
}
