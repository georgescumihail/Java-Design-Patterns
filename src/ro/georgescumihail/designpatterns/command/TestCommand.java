package ro.georgescumihail.designpatterns.command;

public class TestCommand {

	public static void main(String[] args) {
	
		Provider emag = new Provider("Emag");
		
		Courier courier = new Courier("Paula");
		
		courier.addDelivery(new NormalDelivery(5, emag));
		courier.addDelivery(new NormalDelivery(2, emag));
		courier.addDelivery(new PremiumDelivery(3, emag));
		
		courier.sendDeliveries();
	}

}
