package facade;

public class Unit {

	private int processorSpeed;
	
	public Unit(int processorSpeed) {

		this.processorSpeed = processorSpeed;

	}
	
	public void add() {
		
		System.out.println("PC unit with " + processorSpeed + " added");
	}
}
