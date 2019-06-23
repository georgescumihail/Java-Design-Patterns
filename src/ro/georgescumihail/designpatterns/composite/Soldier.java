package ro.georgescumihail.designpatterns.composite;

public class Soldier implements ISoldier{

	private String type;
	
	public Soldier(String type) {
		
		this.type = type;
	}

	@Override
	public void attack() {
		
		System.out.println(type + "has attacked");
	}

	@Override
	public void getInfo() {
	
		System.out.println("The soldier is a " + type);
	}

	@Override
	public void addSoldier(ISoldier s) {

		throw new UnsupportedOperationException();
	}

	@Override
	public void removeSoldier(ISoldier s) {

		throw new UnsupportedOperationException();
		
	}

	@Override
	public ISoldier getSoldier(int i) {

		throw new UnsupportedOperationException();
	}

}
