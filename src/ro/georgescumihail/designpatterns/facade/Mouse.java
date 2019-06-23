package ro.georgescumihail.designpatterns.facade;

public class Mouse {

	private int nrButtons;
	
	public Mouse(int nrButtons) {
		
		this.nrButtons = nrButtons;
	}
	
	public void add() {
		
		System.out.println("Mouse with " + nrButtons + " buttons added");
	}
}
