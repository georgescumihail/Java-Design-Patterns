package state;

public class OpenState implements IState {
	
	@Override
	public void set(Shop shop) {
		
		shop.setState(this);
		
		System.out.println("The shop " + shop.getName() + " was set to open");
	}
}
