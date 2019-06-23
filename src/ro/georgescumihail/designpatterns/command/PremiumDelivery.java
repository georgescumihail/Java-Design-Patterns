package ro.georgescumihail.designpatterns.command;

public class PremiumDelivery implements IDelivery {

	private int nrItems;
	private Provider provider;
	
	public PremiumDelivery(int nrItems, Provider provider) {

		this.nrItems = nrItems;
		this.provider = provider;
	}

	@Override
	public void send() {
		
		provider.deliverPremium(nrItems);
	}

}
