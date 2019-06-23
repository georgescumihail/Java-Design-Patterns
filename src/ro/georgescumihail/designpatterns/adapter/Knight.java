package ro.georgescumihail.designpatterns.adapter;

public class Knight implements IKnight{

	private String title;
	private int xp;
	
	
	
	public Knight(String title, int xp) {

		this.title = title;
		this.xp = xp;
	}

	@Override
	public void hit() {
		
		System.out.println("Knight " + title + " with xp level " + xp + " inflicted an attack");
		
	}

	@Override
	public void block() {
		
		System.out.println("Knight " + title + " with xp level " + xp + " blocked an enemy attack");
		
	}

}
