package state;

public class ClosedState implements IState {

	@Override
	public void set(Shop shop) {
		
		shop.setState(this);
		
		System.out.println("The shop " + shop.getName() + " was set to closed");
	}

}
