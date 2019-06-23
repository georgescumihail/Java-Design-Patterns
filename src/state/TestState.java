package state;

public class TestState {

	public static void main(String[] args) {
		
		Shop auchanTitan = new Shop("Auchan");
		
		IState open = new OpenState();
		IState closed = new ClosedState();
		
		open.set(auchanTitan);
		closed.set(auchanTitan);

	}

}
