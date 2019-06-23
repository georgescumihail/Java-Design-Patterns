package ro.georgescumihail.designpatterns.facade;

public class Screen {

	private int width;
	private int height;
	
	public Screen(int width, int height) {

		this.width = width;
		this.height = height;
	}
	
	public void add() {
		
		System.out.println("Screen with " + width + "x" + height + " added");
	}
}
