package decorator;

public class SimplePlayer implements ICharacter {

	private String name;
	private int power;
	
	
	
	public SimplePlayer(String name, int power) {
		
		this.name = name;
		this.power = power;
	}

	@Override
	public void move() {
		
		System.out.println("Player " + name + " has moved");
	}

	@Override
	public void attack() {
		
		System.out.println("Player " + name + " attacked for " + power + " power");
		
	}

	@Override
	public String getName() {

		return name;
		
	}

	@Override
	public int getPower() {
		
		return power;
	}

}
