package ro.georgescumihail.designpatterns.command;

public class NormalDelivery implements IDelivery{

	private int nrItems;
	private Provider provider;
	
	public NormalDelivery(int nrItems, Provider provider) {

		this.nrItems = nrItems;
		this.provider = provider;
	}

	@Override
	public void send() {
		
		provider.deliverNormal(nrItems);
	}

}