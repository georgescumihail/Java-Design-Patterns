package adapter;

public class Swordsman implements ISwordsman{

	private String name;
	private int level;
	
	
	
	public Swordsman(String name, int level) {

		this.name = name;
		this.level = level;
	}

	@Override
	public void attack() {
		
		System.out.println("Swordsman " + name + " of level " + level + " attacked");
		
	}

	@Override
	public void defend() {
		
		System.out.println("Swordsman " + name + " of level " + level + " defended");
		
	}

}
